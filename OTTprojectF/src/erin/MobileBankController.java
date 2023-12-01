/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package erin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

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
    private void backbuttonOnAction(ActionEvent event) {
    }
    
}
