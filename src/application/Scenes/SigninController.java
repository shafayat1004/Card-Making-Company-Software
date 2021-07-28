package application.Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class SigninController extends SceneChanger{

    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private TextField idTextField;
    @FXML private TextField passwordTextField;
    @FXML private Button signinCheckButton;
    @FXML private Button signupButton;
    @FXML private Button backToWelCome;
    @FXML private ComboBox<String> userTypeSelectionCombobx;
    private String[] userTypes = {"Customer", "Customer Service Employee", "Supervisor", "Designer", "Owner"};

    private Parent root;
    private Scene scene;
    private Stage stage;
    
    private String emailFromButton, passwordFromButton, confirmedPasswordFromButton, userIDFromButton;
    
    public boolean ifEmailExists(String email) {
        //TODO check database for email
        return true;
    }
    public boolean ifIDExists(String id){
        //TODO Check ID from list
        return true;
    }
    public boolean ifPassMatchesForID(String id, String pass){
        //TODO Check ID from list and check if Password matches
        return true;
    }
    public void verifyLogin() {
        if (ifIDExists(userIDFromButton)){
            if (ifPassMatchesForID(userIDFromButton, passwordFromButton)){
                //TODO grant access
            }
            else{
                //TODO alert that pass doesnt match
            }
        }
        else{
            //TODO Alert that ID doesnt exist and offer signup
        }
    }
    public void signup() {
        if(ifEmailExists(emailFromButton) == false){
            if (passwordFromButton == confirmedPasswordFromButton){
                if (ifIDExists(userIDFromButton) == false){
                    //TODO add email and id and password to database
                }
                else{
                    //TODO Alert for new id.
                }
            }
            else{
                //TODO passwords doesnt match alert.
            }
        }
        else{
            //TODO alert that email exists offer login
        }
    }
    @FXML
    void signinCheckButtonOnClick(ActionEvent event) throws IOException  {
        String userType = userTypeSelectionCombobx.getValue();
        if (userType == userTypes[0]) { //customer
            //TODO implement acutal check and only then grant entry
            sceneChange(event, "DashboardCustomer.fxml");
            // root = FXMLLoader.load(getClass().getResource("DashboardCustomer.fxml"));
            // stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            // scene = new Scene(root);
            // stage.setScene(scene);
            // stage.show();

        }else if(userType == userTypes[1]){ //customer service
            //TODO implement acutal check and only then grant entry
            sceneChange(event, "DashboardCSEmp.fxml");

        }else if(userType == userTypes[2]){ //supervisor
            //TODO implement acutal check and only then grant entry
            sceneChange(event, "DashboardSupervisor.fxml");

        }else if(userType == userTypes[3]){ //designer
            //TODO implement acutal check and only then grant entry
            sceneChange(event, "DashboardDesigner.fxml");

        }else if(userType == userTypes[4]){ //owner
            //TODO implement acutal check and only then grant entry
            sceneChange(event, "DashboardOwner.fxml");

        }else{

        }
    }
    @FXML
    void backToWelComeOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "..\\WelcomeScene.fxml");
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
