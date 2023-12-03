/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ahnaf;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MaintainenanceofficerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void maintenancerequestonaction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewMaintainencerequest.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void createmaintenancerequestonaction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Createmaintainencerequest.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void requeststatusonaction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Updaterequeststatus.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void equipmentstatusonaction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Viewequipmentstatus.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void communicationmoduleonaction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Communicationmodule.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void InventoryManagementonaction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Updateinventory.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void energyconsumption(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Trackenergyconsumption.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void feedbackandratingsonaction(ActionEvent event) {
    }
    
}
