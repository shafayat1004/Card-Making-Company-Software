package application.Database;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import application.Assets.Assets;
import application.Database.Address.Address;
import application.Order.Order;
import application.User.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class DatabaseManipulator {

    public static int getCount(String fileName){
        int count = 0;

        File file = new File (fileName);
        if (file.exists ()){
            ObjectInputStream ois = null;
            try{
                ois = new ObjectInputStream (new FileInputStream (fileName));
                while (true){
                    ois.readObject ();
                    count++;
                }
            }
            catch (EOFException e){
                
            }
            catch (Exception e){
                e.printStackTrace ();
            }
            finally{
                try{
                    if (ois != null) {
                        ois.close();
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
        return count;
    }

    public static void setCurrentUser(Object user){
        writeToDatabase(Assets.currentUserFilePath, user, false);
    }

    public static User getCurrentUser(){
        String filePath= Assets.currentUserFilePath;
        File file = new File (filePath);

        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;

            try{
                ois = new ObjectInputStream (new FileInputStream (filePath));
                
                object = ois.readObject();
            }
            catch (EOFException e){
                
            }
            catch (Exception e){
                e.printStackTrace ();
            }
            finally{
                try{
                    if (ois != null) {
                        ois.close();

                        return (User)object;
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
        return null;
    }

    public static void writeToDatabase (String fileName, Object obj, boolean append){
        File file = new File (fileName);
        ObjectOutputStream out = null;
        
        try{
            if (!file.exists () || !append){
                out = new ObjectOutputStream (new FileOutputStream (fileName));
            }
            else {
                out = new AppendableObjectOutputStream (new FileOutputStream (fileName, append));
            }
            out.writeObject(obj);
            out.flush ();
        }
        catch (Exception e){
            e.printStackTrace ();
        }
        finally{
            try{
                if (out != null){
                    out.close ();
                }
            }
            catch (Exception e){
                e.printStackTrace ();
            }
        }
    }
    public static ObservableList<Order> getOrderListFromDatabase() {

        ObservableList<Order> orderList = FXCollections.observableArrayList();
        for (Object object : getObjectListFromDatabase(Assets.ordersFilePath)) {
            orderList.add((Order)object);
        }
        return orderList;
    }
    public static ArrayList<Object> getObjectListFromDatabase (String fileName){
        File file = new File (fileName);
        
        if (file.exists ()){

            ArrayList<Object> list = new ArrayList<Object>();
            ObjectInputStream ois = null;
            try{
                ois = new ObjectInputStream (new FileInputStream (fileName));
                while (true){

                    list.add(ois.readObject ());
                }
            }
            catch (EOFException e){
                
            }
            catch (Exception e){
                e.printStackTrace ();
            }
            finally{
                try{
                    if (ois != null) {
                        ois.close();
                        return list;
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
        return null;
    }
    
    public static Object getObjectFromDatabase(String lookFor, String throughUserType, String filePath) {
        File file = new File (filePath);

        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            boolean found = false;
            try{
                ois = new ObjectInputStream (new FileInputStream (filePath));
                
                while (true){
                    object = ois.readObject();

                    if(object instanceof Credentials){
                        if (((Credentials)object).getId().equals(lookFor)){
                            found = true;
                            break;
                        }
                    }
                    else if (object instanceof Order){
                        if (throughUserType.equals(Assets.userTypes[0])){ //as customer
                            
                            if (((Order)object).getCustomerID().equals(lookFor)){
                                found = true;
                                break;
                            }
                        } 
                        else if (throughUserType.equals(Assets.userTypes[1])){ //as Customer Service Employee
                            
                            if (((Order)object).getCsEmployeeID().equals(lookFor)){
                                found = true;
                                break;
                            }
                        }
                        else if (throughUserType.equals(Assets.userTypes[3])){ //as Designer
                            
                            if (((Order)object).getDesignerID().equals(lookFor)){

                                found = true;
                                break;
                            }
                        }
                        else{
                            if (((Order)object).getDeliverTo().equals(lookFor)){
                                found = true;
                                break;
                            }
                        }
                    }
                    else {
                        if (((User)object).getId().equals(lookFor)){
                            found = true;
                            break;
                        }
                    }
                }
            }
            catch (EOFException e){
                
            }
            catch (Exception e){
                e.printStackTrace ();
            }
            finally{
                try{
                    if (ois != null) {
                        ois.close();
                        if (found == false) return null;
                        return object;
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
        return null;
    }

    public static void deleteACredential(String id){
        File file = new File(Assets.credentialsFilePath);
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            ArrayList<Credentials> newObjects = new ArrayList<Credentials>();
            try{
                ois = new ObjectInputStream (new FileInputStream (Assets.credentialsFilePath));
                while (true){
                    
                    object = ois.readObject();
                    
                    if (((Credentials)object).getId().equals(id)) continue;
                        
                    newObjects.add((Credentials)object);
                }
            }
            catch (EOFException e){
                //TODO exceptionhandling
            }
            catch (Exception e){
                e.printStackTrace ();
            }
            finally{
                try{
                    if (ois != null) {
                        ois.close();
                        
                        boolean ranOnce = false;

                        if(newObjects.isEmpty()){
                            Files.deleteIfExists(Paths.get(Assets.credentialsFilePath));
                        }

                        for (Credentials credentials : newObjects) {
                            if (ranOnce) {
                                writeToDatabase(Assets.credentialsFilePath, credentials, true);    
                            } 
                            else {
                                writeToDatabase(Assets.credentialsFilePath, credentials, false);
                                ranOnce = true;    
                            }
                        }
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
    }
    public static void deleteAnAddress(String id){
        File file = new File(Assets.addressesFilePath);

        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            ArrayList<Address> newObjects = new ArrayList<Address>();
            try{
                ois = new ObjectInputStream (new FileInputStream (Assets.addressesFilePath));
                while (true){
                    
                    object = ois.readObject();
                    
                    if (((Address)object).getUserID().equals(id)) continue;
                        
                    newObjects.add((Address)object);
                }
            }
            catch (EOFException e){
                //TODO exceptionhandling
            }
            catch (Exception e){
                e.printStackTrace ();
            }
            finally{
                try{
                    if (ois != null) {
                        ois.close();
                        
                        boolean ranOnce = false;

                        if(newObjects.isEmpty()){
                            Files.deleteIfExists(Paths.get(Assets.addressesFilePath));
                        }

                        for (Address address : newObjects) {
                            if (ranOnce) {
                                writeToDatabase(Assets.addressesFilePath, address, true);    
                            } 
                            else {
                                writeToDatabase(Assets.addressesFilePath, address, false);
                                ranOnce = true;    
                            }
                        }
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
    }

    // public static void deleteAUser(String id){
    //     File file = new File(Assets.credentialsFilePath);

    // }
    public static void deleteUser(String id, String filepath) {
        File file = new File(filepath);
        
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            ArrayList<User> newObjects = new ArrayList<User>();
            try{
                ois = new ObjectInputStream (new FileInputStream (filepath));
                while (true){
                    
                    object = ois.readObject();
                    
                    if (((User)object).getId().equals(id)) continue;
                        
                    newObjects.add((User)object);
                }
            }
            catch (EOFException e){
                //TODO exceptionhandling
            }
            catch (Exception e){
                e.printStackTrace ();
            }
            finally{
                try{
                    if (ois != null) {
                        ois.close();
                        
                        boolean ranOnce = false;
                        
                        if(newObjects.isEmpty()){
                            Files.deleteIfExists(Paths.get(filepath));
                        }

                        for (User user : newObjects) {
                            
                            if (ranOnce) {
                                writeToDatabase(filepath, user, true);    
                            } 
                            else {
                                writeToDatabase(filepath, user, false);
                                ranOnce = true;    
                            }
                        }
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
    }
    
    public static void editUser(String id, User editedInstance, String filepath){
        deleteUser(id, filepath);
        writeToDatabase(filepath, editedInstance, true);
    }
    
    public static boolean branchExistsInDatabase(String location) {
        boolean found = false;
        File file = new File (Assets.branchesFilePath);
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            try{
                ois = new ObjectInputStream (new FileInputStream (Assets.branchesFilePath));
                while (true){
                    object = ois.readObject();
                    if (((Branch)object).getUpazillaOrCCorp().equals(location)){
                        found = true;
                        break;
                    }
                }
            }
            catch (EOFException e){
                
            }
            catch (Exception e){
                e.printStackTrace ();
            }
            finally{
                try{
                    if (ois != null) {
                        ois.close();
                        return found;
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
        
        return false; 
    }

    public static void deleteABranch(String upazillaOrCCorp){
        File file = new File(Assets.branchesFilePath);
        
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            ArrayList<Branch> newObjects = new ArrayList<Branch>();
            try{
                ois = new ObjectInputStream (new FileInputStream (Assets.branchesFilePath));
                while (true){
                    
                    object = ois.readObject();
                    
                    if (((Branch)object).getUpazillaOrCCorp().equals(upazillaOrCCorp)) continue;
                        
                    newObjects.add((Branch)object);
                }
            }
            catch (EOFException e){
                //TODO exceptionhandling
            }
            catch (Exception e){
                e.printStackTrace ();
            }
            finally{
                try{
                    if (ois != null) {
                        ois.close();
                        
                        boolean ranOnce = false;

                        if(newObjects.isEmpty()){
                            Files.deleteIfExists(Paths.get(Assets.branchesFilePath));
                        }

                        for (Branch branch : newObjects) {
                            
                            if (ranOnce) {
                                writeToDatabase(Assets.branchesFilePath, branch, true);    
                            } 
                            else {
                                writeToDatabase(Assets.branchesFilePath, branch, false);
                                ranOnce = true;    
                            }
                        }
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
    }

    public static void deleteAnOrder(String orderID){
        File file = new File(Assets.ordersFilePath);

        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            ArrayList<Order> newObjects = new ArrayList<Order>();
            try{
                ois = new ObjectInputStream (new FileInputStream (Assets.ordersFilePath));
                while (true){
                    
                    object = ois.readObject();
                    
                    if (((Order)object).getOrderID().equals(orderID)) continue;
                        
                    newObjects.add((Order)object);
                }
            }
            catch (EOFException e){
                //TODO exceptionhandling
            }
            catch (Exception e){
                e.printStackTrace ();
            }
            finally{
                try{
                    if (ois != null) {
                        ois.close();
                        
                        boolean ranOnce = false;

                        if(newObjects.isEmpty()){
                            Files.deleteIfExists(Paths.get(Assets.ordersFilePath));
                        }

                        for (Order order : newObjects) {
                            
                            if (ranOnce) {
                                writeToDatabase(Assets.ordersFilePath, order, true);    
                            } 
                            else {
                                writeToDatabase(Assets.ordersFilePath, order, false);
                                ranOnce = true;    
                            }
                        }
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }

    }

    public static ArrayList<String> getListOfEmployeesInBranch(String upazillaOrCCorp, String designation){
        File file = new File(Assets.branchesFilePath);
        if (file.exists()) {

            Object object = null;
            ObjectInputStream ois = null;
            ArrayList<String> list = new ArrayList<String>();  

            try {
                ois = new ObjectInputStream (new FileInputStream (Assets.branchesFilePath));

                while (true) {
                    object = ois.readObject();
                    if (((Branch)object).getUpazillaOrCCorp().equals(upazillaOrCCorp)){

                        if (designation.equals(Assets.userTypes[1])) { //Customer Service 
                            list = ((Branch)object).getCustomerServiceIDs();
                        }
                        else{
                            list.add(((Branch)object).getSupervisorID());
                        }
                        break;
                    }
                }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            finally{
                try {
                    if (ois != null) {
                        ois.close();
                        return list;
                    }
                    
                } catch (IOException e) {
                    //TODO: handle exception
                }
        
            }
        }
        return null;   
    }

    public static boolean existsInDatabase(String dataType, String input) {

        boolean found = false;
        File file = new File (Assets.credentialsFilePath);
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            try{
                ois = new ObjectInputStream (new FileInputStream (Assets.credentialsFilePath));
                
                if (dataType.equals("Email")) {
                    while (true){
                        object = ois.readObject();
                        if (((Credentials)object).getEmail().equals(input)){
                            found = true;
                            break;
                        }
                    }
                }
                else if (dataType.equals("ID")){
                    while (true){
                        object = ois.readObject();
                        if (((Credentials)object).getId().equals(input)){
                            found = true;
                            break;
                        }
                    }
                }
                else if (dataType.equals("nationalID")){
                    while (true){
                        object = ois.readObject();
                        if (((Credentials)object).getNationalID().equals(input)){
                            found = true;
                            break;
                        }
                    }
                }
                else {}
            }
            catch (EOFException e){
                
            }
            catch (Exception e){
                e.printStackTrace ();
            }
            finally{
                try{
                    if (ois != null) {
                        ois.close();
                        return found;
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
        
        return false; 
    }
    
    private static class AppendableObjectOutputStream extends ObjectOutputStream {
          public AppendableObjectOutputStream(OutputStream out) throws IOException {
              super(out);
          }
          
          @Override
          protected void writeStreamHeader() throws IOException {}
        }
}
