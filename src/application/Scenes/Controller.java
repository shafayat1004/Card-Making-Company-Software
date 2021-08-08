package application.Scenes;

import java.io.IOException;
import java.io.Serializable;
import java.util.regex.*;

import application.Database.DatabaseManipulator;
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


public abstract class Controller{
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

    public boolean idExistsInDatabase(String inputID) {
        if (
            DatabaseManipulator.existsInDatabase("ID", inputID, "src/application/Database/Customers.bin") ||
            DatabaseManipulator.existsInDatabase("ID", inputID, "src/application/Database/EmployeeList/CSEmployees.bin") ||
            DatabaseManipulator.existsInDatabase("ID", inputID, "src/application/Database/EmployeeList/Supervisors.bin") ||
            DatabaseManipulator.existsInDatabase("ID", inputID, "src/application/Database/EmployeeList/Designers.bin") ||
            DatabaseManipulator.existsInDatabase("ID", inputID, "src/application/Database/Owners.bin")
        ) 
        {
            return true;    
        }
        else{
            return false;
        }    
        
    }
    public boolean idExistsInDatabase(String inputID, String userType) {

        if (userType.equals("Customer")) {
            return DatabaseManipulator.existsInDatabase("ID", inputID, "src/application/Database/Customers.bin");
        }
        else if (userType.equals("Customer Service Employee")){
            return DatabaseManipulator.existsInDatabase("ID", inputID, "src/application/Database/EmployeeList/CSEmployees.bin");
        }
        else if (userType.equals("Supervisor")){
            return DatabaseManipulator.existsInDatabase("ID", inputID, "src/application/Database/EmployeeList/Supervisors.bin");
        }
        else if (userType.equals("Designer")){
            return DatabaseManipulator.existsInDatabase("ID", inputID, "src/application/Database/EmployeeList/Designers.bin");
        }
        else if (userType.equals("Owner")){
            return DatabaseManipulator.existsInDatabase("ID", inputID, "src/application/Database/Owners.bin");
        }
        else {
            System.out.println("Not valid userType in");
            return false;
        }
    }

    public boolean passMatchesForID(String id, String pass, String databaseToLookAt) {
        //TODO Check ID from list and check if Password matches
        return true;
    }

    public boolean emailExistsInDatabase(String inputEmail) {
        if (
            DatabaseManipulator.existsInDatabase("Email", inputEmail, "src/application/Database/Customers.bin") ||
            DatabaseManipulator.existsInDatabase("Email", inputEmail, "src/application/Database/EmployeeList/CSEmployees.bin") ||
            DatabaseManipulator.existsInDatabase("Email", inputEmail, "src/application/Database/EmployeeList/Supervisors.bin") ||
            DatabaseManipulator.existsInDatabase("Email", inputEmail, "src/application/Database/EmployeeList/Designers.bin") ||
            DatabaseManipulator.existsInDatabase("Email", inputEmail, "src/application/Database/Owners.bin")
        ) 
        {
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

    public void sceneChange(ActionEvent event, String sceneString, Object object) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneString));
        root = loader.load();
        if (object instanceof Customer) {
            
            DashboardCustomerController dashboardCustomerController = loader.getController();
            dashboardCustomerController.setCurrentUser(customer);
        } 
        else if (object instanceof CustomerService){
            
            DashboardCSEmpController dashboardCSEmpController = loader.getController();
            dashboardCSEmpController.setCurrentUser(customerService);
        }
        else if (object instanceof Supervisor){
            
            DashboardSupervisorController dashboardSupervisorController = loader.getController();
            dashboardSupervisorController.setCurrentUser(supervisor);
        }
        else if (object instanceof Designer){

            DashboardDesignerController dashboardDesignerController = loader.getController();
            dashboardDesignerController.setCurrentUser(designer);
        }
        else if (object instanceof Owner){
            
            DashboardOwnerController dashboardOwnerController = loader.getController();
            dashboardOwnerController.setCurrentUser(owner);
        }
        else {
            //placeholder
        }

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
