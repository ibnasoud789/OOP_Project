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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ContentCreatorController implements Initializable {

    @FXML
    private Button profileCheck;
    @FXML
    private Button contentStream;
    @FXML
    private Button uploadVideo;
    @FXML
    private Button earning;
    @FXML
    private Button loggingOut;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void profileCheckOnAction(ActionEvent event) {
    }

    @FXML
    private void contentStreamOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ContentStream.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();         
    }

    @FXML
    private void uploadVideoOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ContentUpload.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();    
    }

    @FXML
    private void earningOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("earnfromContent.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();          
    }

    @FXML
    private void logginOutOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CommonScene.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();  
    }

    @FXML
    private void backButtonOnAction(ActionEvent event) {
        
    }
    
}
