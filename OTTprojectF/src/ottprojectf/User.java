/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ottprojectf;

/**
 *
 * @author Asif
 */
public class User extends Subscriber {
    
    public User(String mail, String password) {
        super(mail, password);
    }
    String userType;

    public User(String userType, String mail, String password) {
        super(mail, password);
        this.userType = userType;
    }
    
    
}
