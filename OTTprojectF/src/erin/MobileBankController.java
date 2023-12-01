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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class MobileBankController implements Initializable {

    @FXML
    private ComboBox<?> combobox;
    @FXML
    private TextField mobilenum;
    @FXML
    private TextField pinnum;
    @FXML
    private Button submitbutton;
    @FXML
    private Button backbutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void comboboxOnAction(ActionEvent event) {
    }

    @FXML
    private void mobilenumOnAction(ActionEvent event) {
    }

    @FXML
    private void pinnumOnAction(ActionEvent event) {
    }

    @FXML
    private void submitbuttonOnAction(ActionEvent event) {
    }

    @FXML
    private void backbuttonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("earnfromContent.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();           
    }
    
}
