package application.Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import application.Assets.Assets;
import application.Database.DatabaseManipulator;
import application.User.Owner.Owner;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
import javafx.scene.Parent;

public class DashboardOwnerController extends Controller{

    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private Label nameLabel;
    @FXML private Label idLabel;
    @FXML private Button signoutButton;
    @FXML private Tab financialsTab;
    @FXML private Tab noticeTab;
    @FXML private Tab empManagementTab;
    @FXML protected ComboBox<String> locationComboBox;
    @FXML protected ComboBox<String> designationComboBox;
    @FXML protected ComboBox<String> nameComboBox;
    @FXML private CheckBox addNewEmpChkBox;
    @FXML private Button loadEmpMangrButton;

    @FXML private BorderPane empMangrBorderPane;


    @FXML private Tab personalInfoTab;
    @FXML private Tab companyDirTab;
    @FXML private Tab customerDirTab;
    @FXML private Tab newOrdersTab;
    @FXML private Tab ongoingOrdersTab;
    @FXML private Tab completedOrdersTab;
    @FXML private Tab complaintsTab;

    protected Owner currentUser;
    
    public void loadUI(String fxmlfile, String designation, String location) {
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlfile));
            root = loader.load();
            
            if(fxmlfile.equals("AddEmployee.fxml")){
                AddEmployeeController addEmployeeController = loader.getController();
                addEmployeeController.setSelectedDesignation(designation);
                if(designation!= Assets.userTypes[3]){ //[3] is designer
                    addEmployeeController.setSelectedLocation(location);
                }
            }
            else if (fxmlfile.equals("ManageEmployee.fxml")){
                ManageEmployeeController manageEmployeeController = loader.getController();
                manageEmployeeController.setSelectedDesignation(designation);
                if(designation!= Assets.userTypes[3]){ //[3] is designer
                    manageEmployeeController.setSelectedLocation(location);
                }
            }

            empMangrBorderPane.setCenter(root);
        }
        catch (IOException ex) {
            Logger.getLogger(DashboardOwnerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    void signoutButtonOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "WelcomeScene.fxml");
    }

    @FXML
    void loadEmpMangrButtonOnClick(ActionEvent event) {
        String selectedDesignation = designationComboBox.getValue();
        String selectedLocation = locationComboBox.getValue();
        if (addNewEmpChkBox.isSelected()){
            if (selectedDesignation == null) {
                showWarningAlert("No Designation", "Please select Designation");
            }
            else if(selectedLocation == "Not Applicable" && selectedDesignation == Assets.userTypes[3]){ //[3] is designer
                loadUI("AddEmployee.fxml", selectedDesignation, selectedLocation);
            }
            else if(selectedLocation == "Not Applicable" && selectedDesignation == Assets.userTypes[3]){ //[3] is designer
                showInformationAlert("Just In Case", "Designer is not bound by location.\nLocation selection ignored");
                loadUI("AddEmployee.fxml", selectedDesignation, selectedLocation);
            }
            else{
                loadUI("AddEmployee.fxml", selectedDesignation, selectedLocation);
            }
        } else {
                loadUI("ManageEmployee.fxml", selectedDesignation, selectedLocation);
        }
    }

    @FXML
    void initialize() {
        currentUser = (Owner)DatabaseManipulator.getCurrentUser();
        idLabel.setText("ID: " + currentUser.getId());
        nameLabel.setText("Name: " + currentUser.getName());

        designationComboBox.getItems().addAll(Assets.userTypes);
        locationComboBox.getItems().add("Not Applicable");
        locationComboBox.getItems().addAll(Assets.districts);



        assert nameLabel != null : "fx:id=\"nameLabel\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert idLabel != null : "fx:id=\"idLabel\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert signoutButton != null : "fx:id=\"signoutButton\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert financialsTab != null : "fx:id=\"financialsTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert noticeTab != null : "fx:id=\"noticeTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert empManagementTab != null : "fx:id=\"empManagementTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert locationComboBox != null : "fx:id=\"locationComboBox\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert designationComboBox != null : "fx:id=\"designationComboBox\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert nameComboBox != null : "fx:id=\"nameComboBox\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert addNewEmpChkBox != null : "fx:id=\"addNewEmpChkBox\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert loadEmpMangrButton != null : "fx:id=\"loadEmpMangrButton\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert personalInfoTab != null : "fx:id=\"personalInfoTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert companyDirTab != null : "fx:id=\"companyDirTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert customerDirTab != null : "fx:id=\"customerDirTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert newOrdersTab != null : "fx:id=\"newOrdersTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert ongoingOrdersTab != null : "fx:id=\"ongoingOrdersTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert completedOrdersTab != null : "fx:id=\"completedOrdersTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert complaintsTab != null : "fx:id=\"complaintsTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";

        assert empMangrBorderPane != null : "fx:id=\"empMangBorderPane\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
    }
}
