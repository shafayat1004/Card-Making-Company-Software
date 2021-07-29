package application.Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Node;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
// import javafx.stage.Stage;

public class SignupController extends SceneChanger{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField confirmPassTextField;

    @FXML
    private Button signupCheckButton;

    @FXML
    private Button signinButton;

    @FXML
    private TextField idTextField;

    @FXML
    private TextField passwordTextField;

    // private Parent root;
    // private Scene scene;
    // private Stage stage;

    @FXML
    void signinButtonOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "Signin.fxml");
    }
    @FXML
    void backToWelComeOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "..\\WelcomeScene.fxml");
        // root = FXMLLoader.load(getClass().getResource("..\\WelcomeScene.fxml"));
        // stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        // scene = new Scene(root);
        // stage.setScene(scene);
        // stage.show();
    }
    @FXML
    void signupCheckButtonOnClick(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert emailTextField != null : "fx:id=\"emailTextField\" was not injected: check your FXML file 'Signup.fxml'.";
        assert confirmPassTextField != null : "fx:id=\"confirmPassTextField\" was not injected: check your FXML file 'Signup.fxml'.";
        assert signupCheckButton != null : "fx:id=\"signupCheckButton\" was not injected: check your FXML file 'Signup.fxml'.";
        assert signinButton != null : "fx:id=\"signinButton\" was not injected: check your FXML file 'Signup.fxml'.";
        assert idTextField != null : "fx:id=\"idTextField\" was not injected: check your FXML file 'Signup.fxml'.";
        assert passwordTextField != null : "fx:id=\"passwordTextField\" was not injected: check your FXML file 'Signup.fxml'.";

    }
}
