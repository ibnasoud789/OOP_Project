/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ottprojectf;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
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
    private ComboBox<String> categoryComboBox;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private Label logInMessageLabel;
    @FXML
    private ComboBox<String> userTypeComboBox;
    @FXML
    private Button login;
    
    
    
    @FXML
    private void categoryComboBoxOnAction(ActionEvent event) {
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        categoryComboBox.getItems().addAll("Viewer","CustomerSupport","Subscriber","ManagingDirector","ContentCreator","DataAnalyst","AdvertisementController","MaintainanceOfficer");
      
    }    

    @FXML
    private void logInValidateButtonOnClicked(ActionEvent event) throws IOException {
        String userType=userTypeComboBox.getValue();
        if (userType==null){
            showErrorAlert("Error","Please select a user type!");
            return;
        }
        String email=emailTextField.getText();
        String password=passwordTextField.getText();
        
        boolean isValidLogin=UserFile.UserFileRead(userType, email, password);
        if (isValidLogin){
            String mail=UserFile.FileRead_forUserEmail(userType, password, password);
            Stage currentStage= (Stage) login.getScene().getWindow();
            if (userType.equals("Subscriber")){
        Parent root = FXMLLoader.load(getClass().getResource("SubscriberScene.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
            }
            if (userType.equals("ManagingDirector")){
        Parent root = FXMLLoader.load(getClass().getResource("ManagingSirector.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
            }
        }
        else{
            Alert a=new Alert(AlertType.ERROR);
            a.setHeaderText("Unable to login");
            a.setContentText("Email and Password is invalid!");
            a.showAndWait();
        }
        //validateLogIn();

      //  subscriberList= new SubscriberList();
    //}
    //private void validateLogIn(String mail,String password, String userType){
      //  for (Subscriber subscriber: subscriberList.getSubscribers()){
       //     if (subscriber.getMail().equals(mail) && subscriber.getPassword().equals(password)){
        //        logInMessageLabel.setText("Success");
          //  }
        //}
        //logInMessageLabel.setText("Failed!");
       
    }
  

    @FXML
    private void backButtonOnClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CommonScene.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
  
    }
    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
    
}
