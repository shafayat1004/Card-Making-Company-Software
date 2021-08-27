package application.Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Assets.Assets;
import application.Database.DatabaseManipulator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

// import javafx.stage.Stage;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Node;
// import javafx.scene.Parent;
// import javafx.scene.Scene;


public class SigninController extends Controller{

    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private TextField idTextField;
    @FXML private TextField passwordTextField;
    @FXML private Button signinCheckButton;
    @FXML private Button signupButton;
    @FXML private Button backToWelCome;
    @FXML private ComboBox<String> userTypeSelectionCombobx;

    // private Parent root;
    // private Scene scene;
    // private Stage stage;    
    public boolean verifiedLogin(String userType) {
        if (idExistsInDatabase(userIDFromField, userType)){

            if (passMatchesForID(userIDFromField, passwordFromField)){
                return true;
            }
            else{
                //TODO alert that pass doesnt match
                System.out.println("Incorrect Password");
                return false;
            }
        }
        else{
            //TODO Alert that ID doesnt exist and offer signup
            System.out.println("ID Doesn't Exist In "+userType+" Database");
            return false;
        }
    }
    @FXML
    void signinCheckButtonOnClick(ActionEvent event) throws IOException  {
        String userType = userTypeSelectionCombobx.getValue();
        userIDFromField = idTextField.getText();
        passwordFromField = passwordTextField.getText();

        if (userType == Assets.getUserTypes()[0]) { //customer

            if(verifiedLogin(Assets.getUserTypes()[0])){
                customer = DatabaseManipulator.getCustomerDataFromDatabase(userIDFromField);
                sceneChange(event, "DashboardCustomer.fxml", customer);
            }

        }
        else if(userType == Assets.getUserTypes()[1]){ //customer service
            
            if(verifiedLogin(Assets.getUserTypes()[1])){
                customerService = DatabaseManipulator.getCSEmployeeDataFromDatabase(userIDFromField);
                sceneChange(event, "DashboardCSEmp.fxml", customerService);
            }
            
        }
        else if(userType == Assets.getUserTypes()[2]){ //supervisor

            if(verifiedLogin(Assets.getUserTypes()[2])){
                supervisor = DatabaseManipulator.getSupervisorDataFromDatabase(userIDFromField);
                sceneChange(event, "DashboardSupervisor.fxml", supervisor);
            }

        }
        else if(userType == Assets.getUserTypes()[3]){ //designer
            
            if(verifiedLogin(Assets.getUserTypes()[3])){
                designer = DatabaseManipulator.getDesignerDataFromDatabase(userIDFromField);
                sceneChange(event, "DashboardDesigner.fxml", designer);
            }

        }
        else if(userType == Assets.getUserTypes()[4]){ //owner
            
            if(verifiedLogin(Assets.getUserTypes()[4])){
                owner = DatabaseManipulator.getOwnerDataFromDatabase(userIDFromField);
                sceneChange(event, "DashboardOwner.fxml", owner);
            }

        }
        else{
            //placeholder
        }
    }

    @FXML
    void backToWelComeOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "WelcomeScene.fxml");
    }
    @FXML
    void signupButtonOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "Signup.fxml");
    }
    @FXML
    void initialize() {
        userTypeSelectionCombobx.getItems().addAll(Assets.getUserTypes());

        assert idTextField != null : "fx:id=\"idTextField\" was not injected: check your FXML file 'Signin.fxml'.";
        assert passwordTextField != null : "fx:id=\"passwordTextField\" was not injected: check your FXML file 'Signin.fxml'.";
        assert signinCheckButton != null : "fx:id=\"signinCheckButton\" was not injected: check your FXML file 'Signin.fxml'.";
        assert signupButton != null : "fx:id=\"signupButton\" was not injected: check your FXML file 'Signin.fxml'.";
        assert backToWelCome != null : "fx:id=\"backToWelCome\" was not injected: check your FXML file 'Signin.fxml'.";
        assert userTypeSelectionCombobx != null : "fx:id=\"userTypeSelectionCombobx\" was not injected: check your FXML file 'Signin.fxml'.";
    }
}
