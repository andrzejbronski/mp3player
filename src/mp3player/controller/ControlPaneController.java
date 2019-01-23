package mp3player.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ControlPaneController implements Initializable {

    @FXML
    private Button prevButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider songSlider;

    public Button getPrevButton() {
        return prevButton;
    }

    public ToggleButton getPlayButton() {
        return playButton;
    }

    public Button getNextButton() {
        return nextButton;
    }

    public Slider getSongSlider() {
        return songSlider;
    }

    public Slider getVolumeSlider() {
        return volumeSlider;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
