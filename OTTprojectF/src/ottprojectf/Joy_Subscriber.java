/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ottprojectf;
import java.util.ArrayList;

/**
 *
 * @author Asif
 */
public class Joy_Subscriber {
    private String mail;
    private String password;
    //private String userType;

    public Joy_Subscriber(String mail, String password){
        this.mail = mail;
        this.password = password;
       // this.userType = userType;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
