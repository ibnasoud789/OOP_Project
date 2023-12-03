/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package erin;

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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class NusratNetbankingController implements Initializable {

    @FXML
    private ComboBox<String> bankaccount;
    @FXML
    private TextField givecontact;
    @FXML
    private TextField givepin;
    @FXML
    private Button submitbutton;
    @FXML
    private Button gobackbutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        bankaccount.getItems().addAll("AB Bank","Dhaka Bank","MTB");
    }    

    @FXML
    private void bankaccountOnAction(ActionEvent event) {
    }

    @FXML
    private void givecontactOnAction(ActionEvent event) {
    }

    @FXML
    private void givepinOnAction(ActionEvent event) {
    }

    @FXML
    private void submitbuttonOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Operation successful!");

        alert.showAndWait();
    }

    @FXML
    private void gobackbuttonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NusratearnfromContent.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();  
    }
    
}
