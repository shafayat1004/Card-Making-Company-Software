package application.Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Database.Credentials;
import application.Database.DatabaseManipulator;
import application.User.Customer.Customer;
import application.User.Owner.Owner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Node;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
// import javafx.stage.Stage;

public class SignupController extends Controller{

    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private TextField emailTextField;
    @FXML private TextField confirmPassTextField;
    @FXML private Button signupCheckButton;
    @FXML private Button signinButton;
    @FXML private TextField idTextField;
    @FXML private TextField passwordTextField;
    private String ownerAccessCode = "owner123456";


    public void signup() throws IOException {

        if(!emailExistsInDatabase(emailFromField)){

            if (passwordFromField.equals(confirmedPasswordFromField)){

                if (!idExistsInDatabase(userIDFromField)){

                    if (userIDFromField.equals(ownerAccessCode)) {
                        owner = new Owner(emailFromField, userIDFromField, passwordFromField);
                        DatabaseManipulator.writeToDatabase(ownersFilePath, owner, false);
                        credentials = new Credentials(emailFromField, userIDFromField, passwordFromField, "Owner");
                        DatabaseManipulator.writeToDatabase(credentialsFilePath, credentials, true);
                        
                    }
                    else{
                        customer = new Customer(emailFromField, userIDFromField, passwordFromField);
                        DatabaseManipulator.writeToDatabase("src/application/Database/Customers.bin", customer, true);
                        credentials = new Credentials(emailFromField, userIDFromField, passwordFromField, "Customer");
                        DatabaseManipulator.writeToDatabase("src/application/Database/Credentials.bin", credentials, true);
                    }
                }
                else{
                    //TODO Alert for new id.
                    System.out.println("enter different id");
                }
            }
            else{
                //TODO passwords doesnt match alert.
                System.out.println("password doesnt match");
            }
        }
        else{
            //TODO alert that email exists offer login
            System.out.println("email exists");
        }
    }

    @FXML
    void signinButtonOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "Signin.fxml");
    }
    @FXML
    void backToWelComeOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "WelcomeScene.fxml");
        // root = FXMLLoader.load(getClass().getResource("..\\WelcomeScene.fxml"));
        // stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        // scene = new Scene(root);
        // stage.setScene(scene);
        // stage.show();
    }
    @FXML
    void signupCheckButtonOnClick(ActionEvent event) throws IOException {
        emailFromField = emailTextField.getText();
        if(isValidEmail(emailFromField)){
            passwordFromField = passwordTextField.getText();
            confirmedPasswordFromField = confirmPassTextField.getText();
            userIDFromField = idTextField.getText();
            signup();
        }
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
