/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ottprojectf;

import java.io.File;
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
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class NusratContentUploadController_1 implements Initializable {

    @FXML
    private Button file_selection;
    @FXML
    private ComboBox<String> privacy;
    @FXML
    private Button upload_content;
    @FXML
    private ComboBox<Integer> ageselection;
    @FXML
    private ComboBox<String> categorySelection;
    @FXML
    private Button backbutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        privacy.getItems().addAll("Public to all","Subscribers");
        ageselection.getItems().addAll(17,18);
        categorySelection.getItems().addAll("Movie","Documentaries","Anime","Comedy","Horror","Thriller","Sci-Fi","Romatic","Action","Adventure");
        
    }    

    @FXML
    private void file_selectionOnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Video File");
        fileChooser.getExtensionFilters().add(new ExtensionFilter("Video Files", "*.mp4", "*.avi", "*.mkv"));
        
        File selectedFile = fileChooser.showOpenDialog(null);
        
        if (selectedFile != null) {
            // Handle the selected video file (e.g., store the file path)
            String filePath = selectedFile.getAbsolutePath();
            System.out.println("Selected Video: " + filePath);
        }
    }

    @FXML
    private void upload_contentOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Upload Status");
        alert.setHeaderText(null);
        alert.setContentText("Video uploaded successfully!");
        alert.showAndWait();
    }

    @FXML
    private void backbuttonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NusratContentCreator.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();  
    }
    
    
}
