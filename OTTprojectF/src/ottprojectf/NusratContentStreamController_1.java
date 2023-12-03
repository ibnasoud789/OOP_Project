/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ottprojectf;

//import erin.NusratmediaView;
//import erin.NusratselectedVideoLabel;
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaErrorEvent;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class NusratContentStreamController_1 implements Initializable {

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
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Video Files", "*.mp4", "*.avi", "*.mkv"));

        File selectedFile = fileChooser.showOpenDialog(new Stage());

        if (selectedFile != null) {
            NusratselectedVideoLabel.setText("Selected Video: " + selectedFile.getName());

            Media media = new Media(selectedFile.toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            NusratmediaView.setMediaPlayer(mediaPlayer);

            mediaPlayer.play();
        }
    }    

    @FXML
    private void streamPage(ActionEvent event) {
        String videoPath = null;
        Media media = new Media(videoPath);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        NusratmediaView.setMediaPlayer(mediaPlayer);

        mediaPlayer.setOnReady(() -> {
            mediaPlayer.play();
        });
    }
    

    @FXML
    private void gotothePreviousPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NusratContentCreator.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();  
    }

    @FXML
    private void mediaviewOnAction(MediaErrorEvent event) {
    }

    private void playVideo(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
