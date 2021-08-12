package application.Database;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import application.User.User;
import application.User.Customer.Customer;
import application.User.Employee.CustomerService.CustomerService;
import application.User.Employee.Designer.Designer;
import application.User.Employee.Supervisor.Supervisor;
import application.User.Owner.Owner;


public class DatabaseManipulator {

    private static String credentialsFilePath = "src/application/Database/Credentials.bin";
    private static String customersFilePath = "src/application/Database/Customers.bin";
    private static String cSEmployeesFilePath = "src/application/Database/EmployeeList/CSEmployees.bin";
    private static String supervisorFilePath = "src/application/Database/EmployeeList/Supervisors.bin";
    private static String designersFilePath = "src/application/Database/EmployeeList/Designers.bin";
    private static String ownersFilePath = "src/application/Database/Owners.bin";
    
    public static void writeToDatabase (String filename, Object obj, boolean append){
        File file = new File (filename);
        ObjectOutputStream out = null;
        
        try{
            if (!file.exists () || !append){
                out = new ObjectOutputStream (new FileOutputStream (filename));
            }
            else {
                out = new AppendableObjectOutputStream (new FileOutputStream (filename, append));
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

    public static ArrayList<Object> getUserListFromDatabase (String fileName){
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

    public static Credentials getCredentialsDataFromDatabase(String userID) {
        File file = new File (credentialsFilePath);
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            boolean found = false;
            try{
                ois = new ObjectInputStream (new FileInputStream (credentialsFilePath));
                
                while (true){
                    object = ois.readObject();
                    if (((Credentials)object).getId().equals(userID)){
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
                        if (found == false) return null;
                        return (Credentials)object;
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
        
        return null;
    }
    //CUSTOMER DATA RETRIEVE
    public static Customer getCustomerDataFromDatabase(String userID) {

        File file = new File (customersFilePath);
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            boolean found = false;
            try{
                ois = new ObjectInputStream (new FileInputStream (customersFilePath));
                
                while (true){
                    object = ois.readObject();
                    if (((Customer)object).getId().equals(userID)){
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
                        if (found == false) return null;
                        return (Customer)object;
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
        
        return null;
    }
    //CUSTOMER SERVICE DATA RETRIEVE
    public static CustomerService getCSEmployeeDataFromDatabase(String userID) {

        File file = new File (cSEmployeesFilePath);
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            boolean found = false;
            try{
                ois = new ObjectInputStream (new FileInputStream (cSEmployeesFilePath));
                
                while (true){
                    object = ois.readObject();
                    if (((CustomerService)object).getId().equals(userID)){
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
                        if (found == false) return null;
                        return (CustomerService)object;
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
        
        return null;
    }
    //SUPERVISOR DATA RETRIEVE
    public static Supervisor getSupervisorDataFromDatabase(String userID) {

        File file = new File (supervisorFilePath);
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            boolean found = false;
            try{
                ois = new ObjectInputStream (new FileInputStream (supervisorFilePath));
                
                while (true){
                    object = ois.readObject();
                    if (((Supervisor)object).getId().equals(userID)){
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
                        if (found == false) return null;
                        return (Supervisor)object;
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
        
        return null;
    }
    //DESIGNER DATA RETRIEVE
    public static Designer getDesignerDataFromDatabase(String userID) {

        File file = new File (designersFilePath);
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            boolean found = false;
            try{
                ois = new ObjectInputStream (new FileInputStream (designersFilePath));
                
                while (true){
                    object = ois.readObject();
                    if (((Designer)object).getId().equals(userID)){
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
                        if (found == false) return null;
                        return (Designer)object;
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
        
        return null;
    }
    //OWNER DATA RETRIEVE
    public static Owner getOwnerDataFromDatabase(String userID) {

        File file = new File (ownersFilePath);
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            boolean found = false;
            try{
                ois = new ObjectInputStream (new FileInputStream (ownersFilePath));
                
                while (true){
                    object = ois.readObject();
                    if (((Owner)object).getId().equals(userID)){
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
                        if (found == false) return null;
                        return (Owner)object;
                    }
                }
                catch (IOException e){
                    e.printStackTrace ();
                }
            }
        }
        
        return null;
    }
    

    public static boolean existsInDatabase(String dataType, String input) {

        boolean found = false;
        File file = new File (credentialsFilePath);
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            try{
                ois = new ObjectInputStream (new FileInputStream (credentialsFilePath));
                
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
