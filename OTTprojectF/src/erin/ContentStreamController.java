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

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ContentStreamController implements Initializable {

    @FXML
    private Button chooseFile;
    @FXML
    private ComboBox<?> selectPrivacy;
    @FXML
    private ComboBox<?> selectCategory;
    @FXML
    private Button startStreamNow;
    @FXML
    private Button goingBackOption;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void choosefromPC(ActionEvent event) {
    }

    @FXML
    private void streamPage(ActionEvent event) {
    }

    @FXML
    private void gotothePreviousPage(ActionEvent event) {
    }
    
}
