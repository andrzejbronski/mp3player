package mp3player.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.management.PlatformLoggingMXBean;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuPaneController implements Initializable {

    @FXML
    private Menu fileMenu;

    @FXML
    private MenuItem openFile;

    @FXML
    private MenuItem openDirectory;

    @FXML
    private MenuItem closeProgram;

    public Menu getFileMenu() {
        return fileMenu;
    }

    public MenuItem getOpenFile() {
        return openFile;
    }

    public MenuItem getOpenDirectory() {
        return openDirectory;
    }

    public MenuItem getCloseProgram() {
        return closeProgram;
    }

    public MenuItem getAboutMenuItem() {
        return aboutMenuItem;
    }

    @FXML
    private MenuItem aboutMenuItem;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        confugureMenu();

    }
    private void confugureMenu(){
        closeProgram.setOnAction(x -> Platform.exit());

        aboutMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                Parent parent = null;
                try{
                    parent = FXMLLoader.load(getClass().getResource("/mp3player/view/AboutPane.fxml"));

                }catch (IOException e){
                    e.printStackTrace();
                }
                Scene scene = new Scene(parent);
                Stage stage = new Stage();
                stage.setTitle("Mp3Player v1.0 - aboutMe");
                stage.setScene(scene);
                stage.show();
            }
        });
    }
}
