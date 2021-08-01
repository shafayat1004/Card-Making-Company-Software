package application.Scenes;

import java.io.IOException;
import java.util.regex.*;

import application.User.Customer.Customer;
import application.User.Employee.CustomerService.CustomerService;
import application.User.Employee.Designer.Designer;
import application.User.Employee.Supervisor.Supervisor;
import application.User.Owner.Owner;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;


public abstract class Controller {
    private Parent root;
    private Scene scene;
    private Stage stage;
    private String emailStructure; //TODO regex to be determined
    protected String emailFromField, passwordFromField, confirmedPasswordFromField, userIDFromField;
    protected Customer customer;
    protected CustomerService customerService;
    protected Owner owner;
    protected Supervisor supervisor;
    protected Designer designer;



    public boolean isValidEmail(String inputEmail) {
        //TODO check for validity
        return true;
    }

    public boolean idExistsInDatabase(String inputID, String databaseToLookAt) {
        //TODO check if idExistsInDatabase
        return true;
    }

    public boolean passMatchesForID(String id, String pass, String databaseToLookAt) {
        //TODO Check ID from list and check if Password matches
        return true;
    }

    public boolean emailExistsInDatabase(String inputEmail, String databaseToLookAt) {
        //TODO Check if emailExistsInDatabase
        return true;
    }

    public void sceneChange(ActionEvent event, String sceneString) throws IOException{
        stage = new Stage();
        root = FXMLLoader.load(getClass().getResource(sceneString));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void sceneChange(ActionEvent event, String sceneString, Owner owner) throws IOException {

        //stage = new Stage();
        // root = FXMLLoader.load(getClass().getResource(sceneString));
        FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneString));
        root = loader.load();

        DashboardOwnerController dashboardOwnerController = loader.getController();
        dashboardOwnerController.setCurrentUser(owner);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void sceneChange(ActionEvent event, String sceneString, Designer designer) throws IOException {

        // stage = new Stage();
        // root = FXMLLoader.load(getClass().getResource(sceneString));
        FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneString));
        root = loader.load();

        DashboardDesignerController dashboardDesignerController = loader.getController();
        dashboardDesignerController.setCurrentUser(designer);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void sceneChange(ActionEvent event, String sceneString, Supervisor supervisor) throws IOException {

        // stage = new Stage();
        // root = FXMLLoader.load(getClass().getResource(sceneString));
        FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneString));
        root = loader.load();

        DashboardSupervisorController dashboardSupervisorController = loader.getController();
        dashboardSupervisorController.setCurrentUser(supervisor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void sceneChange(ActionEvent event, String sceneString, CustomerService customerService) throws IOException {

        // stage = new Stage();
        // root = FXMLLoader.load(getClass().getResource(sceneString));
        FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneString));
        root = loader.load();

        DashboardCSEmpController dashboardCSEmpController = loader.getController();
        dashboardCSEmpController.setCurrentUser(customerService);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void sceneChange(ActionEvent event, String sceneString, Customer customer) throws IOException {

        // stage = new Stage();
        // root = FXMLLoader.load(getClass().getResource(sceneString));
        FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneString));
        root = loader.load();

        DashboardCustomerController dashboardCustomerController = loader.getController();
        dashboardCustomerController.setCurrentUser(customer);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // public void sceneChange(Event event, String sceneString) throws IOException{
    //     stage = new Stage();
    //     root = FXMLLoader.load(getClass().getResource(sceneString));
    //     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    //     scene = new Scene(root);
    //     stage.setScene(scene);
    //     stage.show();
    // }
}
