package application.Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.User.Customer.Customer;
import application.User.Employee.CustomerService.CustomerService;
import application.User.Employee.Designer.Designer;
import application.User.Employee.Supervisor.Supervisor;
import application.User.Owner.Owner;
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
    private String[] userTypes = {"Customer", "Customer Service Employee", "Supervisor", "Designer", "Owner"};

    // private Parent root;
    // private Scene scene;
    // private Stage stage;    
    public boolean verifiedLogin(String userType) {
        if (idExistsInDatabase(userIDFromField, userType)){
            if (passMatchesForID(userIDFromField, passwordFromField, userType)){
                return true;
            }
            else{
                //TODO alert that pass doesnt match
                return false;
            }
        }
        else{
            //TODO Alert that ID doesnt exist and offer signup
            return false;
        }
    }
    @FXML
    void signinCheckButtonOnClick(ActionEvent event) throws IOException  {
        String userType = userTypeSelectionCombobx.getValue();
        userIDFromField = idTextField.getText();
        passwordFromField = passwordTextField.getText();

        if (userType == userTypes[0]) { //customer

            if(verifiedLogin(userTypes[0])){
                customer = new Customer(userIDFromField);
                sceneChange(event, "DashboardCustomer.fxml", customer);
            }



            // root = FXMLLoader.load(getClass().getResource("DashboardCustomer.fxml"));
            // stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            // scene = new Scene(root);
            // stage.setScene(scene);
            // stage.show();

        }else if(userType == userTypes[1]){ //customer service
            
            if(verifiedLogin(userTypes[1])){
                customerService = new CustomerService(userIDFromField);
                sceneChange(event, "DashboardCSEmp.fxml", customerService);
            }
            
        }else if(userType == userTypes[2]){ //supervisor

            if(verifiedLogin(userTypes[2])){
                supervisor = new Supervisor(userIDFromField);
                sceneChange(event, "DashboardSupervisor.fxml", supervisor);
            }

        }else if(userType == userTypes[3]){ //designer
            
            if(verifiedLogin(userTypes[3])){
                designer = new Designer(userIDFromField);
                sceneChange(event, "DashboardDesigner.fxml", designer);
            }

        }else if(userType == userTypes[4]){ //owner
            
            if(verifiedLogin(userTypes[4])){
                owner = new Owner(userIDFromField);
                sceneChange(event, "DashboardOwner.fxml", owner);
            }

        }else{

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
        userTypeSelectionCombobx.getItems().addAll(userTypes);

        assert idTextField != null : "fx:id=\"idTextField\" was not injected: check your FXML file 'Signin.fxml'.";
        assert passwordTextField != null : "fx:id=\"passwordTextField\" was not injected: check your FXML file 'Signin.fxml'.";
        assert signinCheckButton != null : "fx:id=\"signinCheckButton\" was not injected: check your FXML file 'Signin.fxml'.";
        assert signupButton != null : "fx:id=\"signupButton\" was not injected: check your FXML file 'Signin.fxml'.";
        assert backToWelCome != null : "fx:id=\"backToWelCome\" was not injected: check your FXML file 'Signin.fxml'.";
        assert userTypeSelectionCombobx != null : "fx:id=\"userTypeSelectionCombobx\" was not injected: check your FXML file 'Signin.fxml'.";
    }
}
