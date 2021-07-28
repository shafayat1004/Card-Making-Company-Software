package application.Scenes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;

public class DashboardOwnerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button signoutButton;

    @FXML
    private Tab financialsTab;

    @FXML
    private Tab companyDirTab;

    @FXML
    private Tab noticeTab;

    @FXML
    private Tab employeeListTab;

    @FXML
    private Tab personalInfoTab;

    @FXML
    private Tab newOrdersTab;

    @FXML
    private Tab ongoingOrdersTab;

    @FXML
    private Tab completedOrdersTab;

    @FXML
    private Label idLabel;

    @FXML
    private Label nameLabel;

    @FXML
    void companyDirTabOnClick(ActionEvent event) {

    }

    @FXML
    void completedOrdersTabOnClick(ActionEvent event) {

    }

    @FXML
    void employeeListTabOnClick(ActionEvent event) {

    }

    @FXML
    void financialsTabOnClick(ActionEvent event) {

    }

    @FXML
    void newOrdersTabOnClick(ActionEvent event) {

    }

    @FXML
    void noticeTabOnClick(ActionEvent event) {

    }

    @FXML
    void ongoingOrdersTab(ActionEvent event) {

    }

    @FXML
    void personalInfoTabOnClick(ActionEvent event) {

    }

    @FXML
    void signoutButtonOnClick(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert signoutButton != null : "fx:id=\"signoutButton\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert financialsTab != null : "fx:id=\"financialsTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert companyDirTab != null : "fx:id=\"companyDirTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert noticeTab != null : "fx:id=\"noticeTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert employeeListTab != null : "fx:id=\"employeeListTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert personalInfoTab != null : "fx:id=\"personalInfoTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert newOrdersTab != null : "fx:id=\"newOrdersTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert ongoingOrdersTab != null : "fx:id=\"ongoingOrdersTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert completedOrdersTab != null : "fx:id=\"completedOrdersTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert idLabel != null : "fx:id=\"idLabel\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert nameLabel != null : "fx:id=\"nameLabel\" was not injected: check your FXML file 'DashboardOwner.fxml'.";

    }
}
