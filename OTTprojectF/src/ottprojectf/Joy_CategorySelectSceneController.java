/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ottprojectf;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;

/**
 * FXML Controller class
 *
 * @author Asif
 */
public class Joy_CategorySelectSceneController implements Initializable {

    @FXML
    private CheckBox moviesCheckBox;
    @FXML
    private CheckBox tvShowsCheckBox;
    @FXML
    private CheckBox documentariesCheckBox;
    @FXML
    private CheckBox animeCheckBox;
    @FXML
    private CheckBox standUpComedyCheckBox;
    @FXML
    private CheckBox kidsAndFamilyCheckBox;
    @FXML
    private CheckBox horrorAndThrillerCheckBox;
    @FXML
    private CheckBox realityTVCheckBox;
    @FXML
    private CheckBox scifiAndFantasyCheckBox;
    @FXML
    private CheckBox romanticMoviesCheckBox;
    @FXML
    private CheckBox internationalContentCheckBox;
    @FXML
    private CheckBox actionAndAdventureCheckBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirmButtonOnClicked(ActionEvent event) {
    }
    
}
