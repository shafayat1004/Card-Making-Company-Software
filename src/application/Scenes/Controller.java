package application.Scenes;
import java.io.IOException;

import application.Assets.Assets;
import application.Database.Credentials;
import application.Database.DatabaseManipulator;
import application.User.Customer.Customer;
import application.User.Employee.CustomerService.CustomerService;
import application.User.Employee.Designer.Designer;
import application.User.Employee.Supervisor.Supervisor;
import application.User.Owner.Owner;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;


public abstract class Controller{
    private Parent root;
    private Scene scene;
    private Stage stage;
    //private String emailStructure; //TODO regex to be determined
    protected String nameFromField, emailFromField, passwordFromField, confirmedPasswordFromField, userIDFromField;
    protected Customer customer;
    protected CustomerService customerService;
    protected Owner owner;
    protected Supervisor supervisor;
    protected Designer designer;
    protected Credentials credentials;

    public boolean isValidEmail(String inputEmail) {
        //TODO check for validity
        return true;
    }
    public boolean idExistsInDatabase(String inputID, String databaseToLookAt) {
        Credentials retrieved = (Credentials)DatabaseManipulator.getObjectFromDatabase(inputID, Assets.credentialsFilePath);

        if (retrieved!=null && retrieved.getUserType().equals(databaseToLookAt)){
            return true;
        }
        else return false;
    }
    public boolean idExistsInDatabase(String inputID) {
        return DatabaseManipulator.existsInDatabase("ID", inputID);
    }

    public boolean passMatchesForID(String id, String pass) {

        Credentials retrieved = (Credentials)DatabaseManipulator.getObjectFromDatabase(id, Assets.credentialsFilePath);

        if(retrieved.getPassword().equals(pass)){
            return true;
        }
        else return false;
    }

    public boolean emailExistsInDatabase(String inputEmail) {
        if (DatabaseManipulator.existsInDatabase("Email", inputEmail)){
            return true;    
        }
        else{
            return false;
        }   
    }

    public boolean nIDExistsInDatabase(String inputNID) {
        if (DatabaseManipulator.existsInDatabase("nationalID", inputNID)){
            return true;    
        }
        else{
            return false;
        }  
    }

    public void sceneChange(ActionEvent event, String sceneString) throws IOException{
        stage = new Stage();
        root = FXMLLoader.load(getClass().getResource(sceneString));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void showWarningAlert(String title, String content) {
        Alert incomplete = new Alert(Alert.AlertType.WARNING);
        incomplete.setTitle(title);
        incomplete.setContentText(content);
        incomplete.setHeaderText(null);
        incomplete.showAndWait();
    }
    public void showInformationAlert(String title, String content) {
        Alert incomplete = new Alert(Alert.AlertType.INFORMATION);
        incomplete.setTitle(title);
        incomplete.setContentText(content);
        incomplete.setHeaderText(null);
        incomplete.showAndWait();
    }

}
