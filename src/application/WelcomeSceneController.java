package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WelcomeSceneController {

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
    
    private Parent root;
    private Scene scene;
    private Stage stage;

    @FXML
    void aboutUsButtonOnClick(ActionEvent event) {

    }

    @FXML
    void signinButtonOnClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/Signin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void signupButtonOnClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/Signup.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {
        assert signupButton != null : "fx:id=\"signupButton\" was not injected: check your FXML file 'WelcomeScene.fxml'.";
        assert signinButton != null : "fx:id=\"signinButton\" was not injected: check your FXML file 'WelcomeScene.fxml'.";
        assert aboutUsButton != null : "fx:id=\"aboutUsButton\" was not injected: check your FXML file 'WelcomeScene.fxml'.";

    }
}
