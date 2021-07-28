package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Scenes.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class WelcomeSceneController extends SceneChanger{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button signupButton;

    @FXML
    private Button signinButton;

    @FXML
    private Button aboutUsButton;

    @FXML
    void aboutUsButtonOnClick(ActionEvent event) {

    }

    @FXML
    void signinButtonOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "Scenes/Signin.fxml");
    }

    @FXML
    void signupButtonOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "Scenes/Signup.fxml");
    }

    @FXML
    void initialize() {
        assert signupButton != null : "fx:id=\"signupButton\" was not injected: check your FXML file 'WelcomeScene.fxml'.";
        assert signinButton != null : "fx:id=\"signinButton\" was not injected: check your FXML file 'WelcomeScene.fxml'.";
        assert aboutUsButton != null : "fx:id=\"aboutUsButton\" was not injected: check your FXML file 'WelcomeScene.fxml'.";

    }
}
