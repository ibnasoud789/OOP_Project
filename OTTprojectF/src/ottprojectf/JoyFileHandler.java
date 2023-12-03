/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ottprojectf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Asif
 */
public class JoyFileHandler {

    public static void saveUser(Joy_Subscriber user, String filePath, boolean append) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath, append))) {
            outputStream.writeObject(user);
            System.out.println("User data saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to save user data.");
        }
    }

    public static Joy_Subscriber loadUser(String filePath) {
        Joy_Subscriber user = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            user = (Joy_Subscriber) inputStream.readObject();
            System.out.println("User data loaded successfully!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Failed to load user data.");
        }
        return user;
    }

    public static boolean checkFileExists(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }
}
