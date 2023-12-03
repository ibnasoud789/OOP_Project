/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package erin;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaErrorEvent;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ContentStreamController_1 implements Initializable {

    @FXML
    private Button chooseFile;
    @FXML
    private ComboBox<String> selectCategory;
    @FXML
    private Button startStreamNow;
    @FXML
    private Button goingBackOption;
    @FXML
    private MediaView mediaview;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectCategory.getItems().addAll("Movie","Documentaries","Anime","Comedy","Horror","Thriller","Sci-Fi","Romatic","Action","Adventure");
        
    }    

    @FXML
    private void choosefromPC(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Video File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Video Files", "*.mp4", "*.flv", "*.mkv", "*.avi"));

        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            playVideo(selectedFile.toURI().toString());
        }
    }

    @FXML
    private void streamPage(ActionEvent event) {
        String videoPath = null;
        Media media = new Media(videoPath);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);

        mediaPlayer.setOnReady(() -> {
            mediaPlayer.play();
        });
    }
    

    @FXML
    private void gotothePreviousPage(ActionEvent event) {
    }

    @FXML
    private void mediaviewOnAction(MediaErrorEvent event) {
    }

    private void playVideo(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
