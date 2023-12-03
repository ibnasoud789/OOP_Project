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
public class NusratGenreSelectionController implements Initializable {

    @FXML
    private Button actionShow;
    @FXML
    private Button thrillerShow;
    @FXML
    private Button romanticShow;
    @FXML
    private Button horrorShow;
    @FXML
    private Button comedyShow;
    @FXML
    private Button animeShow;
    @FXML
    private Button scifiShow;
    @FXML
    private Button realityShow;
    @FXML
    private Button fantasyShow;
    @FXML
    private Button adventureShow;
    @FXML
    private Button documentaryShow;
    @FXML
    private Button internationalShow;
    @FXML
    private Button kidsShow;
    @FXML
    private Button familyShow;
    @FXML
    private Button gobackbutton;
    @FXML
    private Button logoutbutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void actionShowOnAction(ActionEvent event) {
    }

    @FXML
    private void gobackbuttonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Nusratviewers.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();  
    }

    @FXML
    private void logoutbuttonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CommonScene.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();  
    }
    
}
