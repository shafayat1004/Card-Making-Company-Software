package application.Scenes;
import java.io.IOException;

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
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;


public abstract class Controller{
    private Parent root;
    private Scene scene;
    private Stage stage;
    //private String emailStructure; //TODO regex to be determined
    protected String emailFromField, passwordFromField, confirmedPasswordFromField, userIDFromField;
    protected Customer customer;
    protected CustomerService customerService;
    protected Owner owner;
    protected Supervisor supervisor;
    protected Designer designer;
    protected Credentials credentials;
    protected static String credentialsFilePath = "src/application/Database/Credentials.bin";
    protected static String customersFilePath = "src/application/Database/Customers.bin";
    protected static String cSEmployeesFilePath = "src/application/Database/EmployeeList/CSEmployees.bin";
    protected static String supervisorFilePath = "src/application/Database/EmployeeList/Supervisors.bin";
    protected static String designersFilePath = "src/application/Database/EmployeeList/Designers.bin";
    protected static String ownersFilePath = "src/application/Database/Owners.bin";

    public boolean isValidEmail(String inputEmail) {
        //TODO check for validity
        return true;
    }
    public boolean idExistsInDatabase(String inputID, String databaseToLookAt) {
        Credentials retrieved = DatabaseManipulator.getCredentialsDataFromDatabase(inputID);
        if (retrieved!=null && retrieved.getUserType().equals(databaseToLookAt)){
            return true;
        }
        else return false;
    }
    public boolean idExistsInDatabase(String inputID) {
        return DatabaseManipulator.existsInDatabase("ID", inputID);
    }

    public boolean passMatchesForID(String id, String pass) {
        Credentials retrieved = DatabaseManipulator.getCredentialsDataFromDatabase(id);
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
