package application.Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import application.Assets.Assets;
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
    @FXML private ComboBox<String> locationComboBox;
    @FXML private ComboBox<String> designationComboBox;
    @FXML private ComboBox<String> nameComboBox;
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

    public Owner getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Owner currentUser) {
        this.currentUser = currentUser;
        idLabel.setText("ID: " + currentUser.getId());
    }
    
    public void loadUI(String fxmlfile) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource(fxmlfile));
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
        if (addNewEmpChkBox.isSelected()){
            loadUI("AddEmployee.fxml");
        } else {
            loadUI("ManageEmployee.fxml");
        }
    }

    @FXML
    void initialize() {
        designationComboBox.getItems().addAll(Assets.getUserTypes());
        locationComboBox.getItems().addAll(Assets.getDistricts());



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
