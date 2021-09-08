package application.Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Assets.Assets;
import application.Database.Credentials;
import application.Database.DatabaseManipulator;
import application.User.Customer.Customer;
import application.User.Owner.Owner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Node;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
// import javafx.stage.Stage;

public class SignupController extends Controller{

    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private TextField emailTextField;
    @FXML private TextField confirmPassTextField;
    @FXML private TextField nameTextField;
    @FXML private Button signupCheckButton;
    @FXML private Button signinButton;
    @FXML private Button backToWelCome;
    @FXML private TextField idTextField;
    @FXML private TextField passwordTextField;
    private String ownerAccessCode = "owner123456";


    public void signup(ActionEvent event) throws IOException {

        if(!emailExistsInDatabase(emailFromField)){

            if (passwordFromField.equals(confirmedPasswordFromField)){

                if (!idExistsInDatabase(userIDFromField)){

                    if (userIDFromField.equals(ownerAccessCode)) {
                        owner = new Owner(nameFromField, emailFromField, userIDFromField, passwordFromField);
                        DatabaseManipulator.writeToDatabase(Assets.ownersFilePath, owner, false);
                        credentials = new Credentials(emailFromField, userIDFromField, passwordFromField, "Owner", "N/A");
                        DatabaseManipulator.writeToDatabase(Assets.credentialsFilePath, credentials, true);
                        showInformationAlert("Success", "You can signin now :)");
                        
                    }
                    else{
                        customer = new Customer(nameFromField, emailFromField, userIDFromField, passwordFromField);
                        DatabaseManipulator.writeToDatabase(Assets.customersFilePath, customer, true);
                        credentials = new Credentials(emailFromField, userIDFromField, passwordFromField, "Customer", "N/A");
                        DatabaseManipulator.writeToDatabase(Assets.credentialsFilePath, credentials, true);
                        showInformationAlert("Success", "You can signin now :)");
                    }
                }
                else{
                    showWarningAlert("ID Exists", "Please enter a different ID");
                }
            }
            else{
                showWarningAlert("Password mismatch", "Passwords do not match, try again");
            }
        }
        else{

            Alert emailExists = new Alert(Alert.AlertType.CONFIRMATION);
            emailExists.setTitle("Email Exists Already");
            emailExists.setContentText("This email already exists.\nWould you like to signin?");
            emailExists.setHeaderText(null);

            ButtonType yes = new ButtonType("Yes Please!");
            ButtonType no = new ButtonType("No Thanks :)");
            ButtonType tryAgain = new ButtonType("Try Again");
        
            emailExists.getButtonTypes().setAll(yes, no, tryAgain);

            Optional<ButtonType> result = emailExists.showAndWait();
            if(result.get() == yes){
                sceneChange(event, "Signin.fxml");
            }
            else if(result.get() == no){
                sceneChange(event, "WelcomeScene.fxml");
            }
            else if (result.get() == tryAgain){
                emailExists.close();
            }
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
        nameFromField = nameTextField.getText();
        emailFromField = emailTextField.getText();
        passwordFromField = passwordTextField.getText();
        confirmedPasswordFromField = confirmPassTextField.getText();
        userIDFromField = idTextField.getText();

        if (emailFromField.isBlank() || passwordFromField.isBlank() || confirmedPasswordFromField.isBlank() || userIDFromField.isBlank()){
            showWarningAlert("Incomplete Fields", "Please fill out all fields");
            return;
        }

        if(isValidEmail(emailFromField)){
            signup(event);
        }
    }

    @FXML
    void initialize() {
        assert nameTextField != null : "fx:id=\"nameTextField\" was not injected: check your FXML file 'Signup.fxml'.";
        assert emailTextField != null : "fx:id=\"emailTextField\" was not injected: check your FXML file 'Signup.fxml'.";
        assert idTextField != null : "fx:id=\"idTextField\" was not injected: check your FXML file 'Signup.fxml'.";
        assert passwordTextField != null : "fx:id=\"passwordTextField\" was not injected: check your FXML file 'Signup.fxml'.";
        assert confirmPassTextField != null : "fx:id=\"confirmPassTextField\" was not injected: check your FXML file 'Signup.fxml'.";
        assert signupCheckButton != null : "fx:id=\"signupCheckButton\" was not injected: check your FXML file 'Signup.fxml'.";
        assert signinButton != null : "fx:id=\"signinButton\" was not injected: check your FXML file 'Signup.fxml'.";
        assert backToWelCome != null : "fx:id=\"backToWelCome\" was not injected: check your FXML file 'Signup.fxml'.";

    }
}
