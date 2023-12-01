/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ottprojectf;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asif
 */
public class LogInSceneController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    //private ArrayList<Subscriber> subscriberList;
    //private SubscriberList subscriberList;
    @FXML
    private TextField emailTextField;
    private TextField passwordTextField;
    @FXML
    private ComboBox<String> categoryComboBox;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private Label logInMessageLabel;
    
    
    
    @FXML
    private void categoryComboBoxOnAction(ActionEvent event) {
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        categoryComboBox.getItems().addAll("Viewer","CustomerSupport","Subscriber","ManagingDirector","ContentCreator","DataAnalyst","AdvertisementController","MaintainanceOfficer");
      
    }    
/**
    @FXML
    private void logInValidateButtonOnClicked(ActionEvent event) throws IOException {
        //validateLogIn();
        subscriberList= new SubscriberList();
        
        
    }
    private void validateLogIn(String mail,String password, String userType){
        for (Subscriber subscriber: subscriberList.getSubscribers()){
            if (subscriber.getMail().equals(mail) && subscriber.getPassword().equals(password)){
                logInMessageLabel.setText("Success");
            }
        }
        logInMessageLabel.setText("Failed!");
    } **/
    @FXML
    private void backButtonOnClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CommonScene.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
  
    }
    
}
