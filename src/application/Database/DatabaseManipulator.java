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

public class DatabaseManipulator {
    
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

    public static Object getUserDataFromDatabase(String userID, String fileName) {
        
        File file = new File (fileName);
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            try{
                ois = new ObjectInputStream (new FileInputStream (fileName));
                
                while (true){
                    object = ois.readObject();
                    if (((User)object).getId().equals(userID)){
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

    public static boolean existsInDatabase(String dataType, String input, String fileName) {
        boolean found = false;
        File file = new File (fileName);
        if (file.exists ()){
            ObjectInputStream ois = null;
            Object object = null;
            try{
                ois = new ObjectInputStream (new FileInputStream (fileName));
                
                if (dataType.equals("Email")) {
                    while (true){
                        object = ois.readObject();
                        if (((User)object).getEmail().equals(input)){
                            found = true;
                            break;
                        }
                    }
                }
                else if (dataType.equals("ID")){
                    while (true){
                        object = ois.readObject();
                        if (((User)object).getId().equals(input)){
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
