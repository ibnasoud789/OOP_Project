/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ottprojectf;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Asif
 */
public class UserFile {
    public static boolean UserFileWrite(User UserInfo,String nameFile){
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        Boolean result=false;
        try{
            f= new File(nameFile+"users.txt");
            if(f.exists()){
                 
                 fos = new FileOutputStream(f,true);
                 oos = new AppendableObjectOutputStream(fos);
            }
            else{
                 
                 fos = new FileOutputStream(f);
                 oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(UserInfo);
            result = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(oos!=null) oos.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return result;
    }
    
    public static boolean UserFileRead(String nameFile,String mail,String password){
        File f= null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Boolean result=false;
        try{
            fis = new FileInputStream(nameFile+"users.txt");
            ois = new ObjectInputStream(fis);
            while(true){
                try{
                    User UserInfo = (User) ois.readObject();
                    if(UserInfo.getEmail().equals(mail) && UserInfo.getPassword().equals(password)){
                        result=true;
                        break;
                    }
               
                       
                   }
                catch(EOFException ef){
                    break;
                   }
                
               }            
            }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(ois!=null) ois.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return result;
     }
        
    //reaf filefor sending user fullname------------------
    public static String FileRead_forUserEmail(String nameFile,String mail,String password){
        File f= null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        String result= null;
        try{
            fis = new FileInputStream(nameFile+"users.txt");
            ois = new ObjectInputStream(fis);
            while(true){
                try{
                    User UserInfo = (User) ois.readObject();
                    if(UserInfo.getEmail().equals(mail) && UserInfo.getPassword().equals(password)){
                        result=UserInfo.getEmail();
                        break;
                    }
               
                       
                   }
                catch(EOFException ef){
                    break;
                   }
                
               }            
            }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(ois!=null) ois.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return result;
     }
    
}

