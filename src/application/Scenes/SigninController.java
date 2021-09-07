package application.Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Assets.Assets;
import application.Database.DatabaseManipulator;
import application.User.Customer.Customer;
import application.User.Employee.CustomerService.CustomerService;
import application.User.Employee.Designer.Designer;
import application.User.Employee.Supervisor.Supervisor;
import application.User.Owner.Owner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
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
    public boolean verifiedLogin(String userType, ActionEvent event ) throws IOException {
        if (idExistsInDatabase(userIDFromField, userType)){

            if (passMatchesForID(userIDFromField, passwordFromField)){
                return true;
            }
            else{
                showWarningAlert("Wrong Password", "Incorrect Password Input");
                return false;
            }
        }
        else{
            Alert noID = new Alert(Alert.AlertType.CONFIRMATION);
            noID.setTitle("ID Not Found");
            noID.setContentText("ID Doesn't Exist In "+userType+" Database.\nIf you're a customer, Would you like to signup?");
            noID.setHeaderText(null);

            ButtonType yes = new ButtonType("Yes Please!");
            ButtonType no = new ButtonType("No Thanks :)");
            ButtonType tryAgain = new ButtonType("Try Again");
        
            noID.getButtonTypes().setAll(yes, no, tryAgain);

            Optional<ButtonType> result = noID.showAndWait();
            if(result.get() == yes){
                //you need to write the code to perform the actual task 
                sceneChange(event, "Signup.fxml");
            }
            else if(result.get() == no){
                sceneChange(event, "WelcomeScene.fxml");
            }
            else if (result.get() == tryAgain){
                noID.close();
            }
            return false;
        }
    }
    @FXML
    void signinCheckButtonOnClick(ActionEvent event) throws IOException  {
        String userType = userTypeSelectionCombobx.getValue();
        userIDFromField = idTextField.getText();
        passwordFromField = passwordTextField.getText();

        if (userType == null| userIDFromField.isBlank() || passwordFromField.isBlank()) {
            showWarningAlert("Incomplete Fields", "Please fill out all fields");
            return;
        }

        if (userType == Assets.userTypes[0]) { //customer

            if(verifiedLogin(Assets.userTypes[0], event)){
                customer = (Customer)DatabaseManipulator.getObjectFromDatabase(userIDFromField, null, Assets.customersFilePath);
                DatabaseManipulator.setCurrentUser(customer);
                sceneChange(event, "DashboardCustomer.fxml");
            }

        }
        else if(userType == Assets.userTypes[1]){ //customer service
            
            if(verifiedLogin(Assets.userTypes[1], event)){
                customerService = (CustomerService)DatabaseManipulator.getObjectFromDatabase(userIDFromField, null, Assets.cSEmployeesFilePath);
                DatabaseManipulator.setCurrentUser(customerService);
                sceneChange(event, "DashboardCSEmp.fxml");
            }
            
        }
        else if(userType == Assets.userTypes[2]){ //supervisor

            if(verifiedLogin(Assets.userTypes[2], event)){
                supervisor = (Supervisor)DatabaseManipulator.getObjectFromDatabase(userIDFromField, null, Assets.supervisorFilePath);
                DatabaseManipulator.setCurrentUser(supervisor);
                sceneChange(event, "DashboardSupervisor.fxml");
            }

        }
        else if(userType == Assets.userTypes[3]){ //designer
            
            if(verifiedLogin(Assets.userTypes[3], event)){
                designer = (Designer)DatabaseManipulator.getObjectFromDatabase(userIDFromField, null, Assets.designersFilePath);
                DatabaseManipulator.setCurrentUser(designer);
                sceneChange(event, "DashboardDesigner.fxml");
            }

        }
        else if(userType == Assets.userTypes[4]){ //owner
            
            if(verifiedLogin(Assets.userTypes[4], event)){
                owner = (Owner)DatabaseManipulator.getObjectFromDatabase(userIDFromField, null, Assets.ownersFilePath);
                DatabaseManipulator.setCurrentUser(owner);
                sceneChange(event, "DashboardOwner.fxml");

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
        userTypeSelectionCombobx.getItems().addAll(Assets.userTypes);

        assert idTextField != null : "fx:id=\"idTextField\" was not injected: check your FXML file 'Signin.fxml'.";
        assert passwordTextField != null : "fx:id=\"passwordTextField\" was not injected: check your FXML file 'Signin.fxml'.";
        assert signinCheckButton != null : "fx:id=\"signinCheckButton\" was not injected: check your FXML file 'Signin.fxml'.";
        assert signupButton != null : "fx:id=\"signupButton\" was not injected: check your FXML file 'Signin.fxml'.";
        assert backToWelCome != null : "fx:id=\"backToWelCome\" was not injected: check your FXML file 'Signin.fxml'.";
        assert userTypeSelectionCombobx != null : "fx:id=\"userTypeSelectionCombobx\" was not injected: check your FXML file 'Signin.fxml'.";
    }
}
