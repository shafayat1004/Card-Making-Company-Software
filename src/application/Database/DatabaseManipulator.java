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

import application.Assets.Assets;
import application.User.User;


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
        writeToDatabase(Assets.getCurrentUserFilePath(), user, false);
    }

    public static User getCurrentUser(){
        String filePath= Assets.getCurrentUserFilePath();
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
    
    public static Object getObjectFromDatabase(String userID, String filePath) {
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
                        if (((Credentials)object).getId().equals(userID)){
                            found = true;
                            break;
                        }
                    }
                    else {
                        if (((User)object).getId().equals(userID)){
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
    

    public static boolean existsInDatabase(String dataType, String input) {

        boolean found = false;
        File file = new File (Assets.getCredentialsFilePath());
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            try{
                ois = new ObjectInputStream (new FileInputStream (Assets.getCredentialsFilePath()));
                
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
