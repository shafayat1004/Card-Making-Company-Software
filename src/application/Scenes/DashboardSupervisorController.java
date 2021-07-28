package application.Scenes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;

public class DashboardSupervisorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button signoutButton;

    @FXML
    private Tab noticeTab;

    @FXML
    private Tab newOrdersTab;

    @FXML
    private Tab ongoingOrdersTab;

    @FXML
    private Tab completedOrdersTab;

    @FXML
    private Tab transactionsTab;

    @FXML
    private Tab employeeListTab;

    @FXML
    private Tab companyDirTab;

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
    void newOrdersTabOnClick(ActionEvent event) {

    }

    @FXML
    void noticeTabOnClick(ActionEvent event) {

    }

    @FXML
    void ongoingOrdersTab(ActionEvent event) {

    }

    @FXML
    void signoutButtonOnClick(ActionEvent event) {

    }

    @FXML
    void transactionsTabOnClick(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert signoutButton != null : "fx:id=\"signoutButton\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert noticeTab != null : "fx:id=\"noticeTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert newOrdersTab != null : "fx:id=\"newOrdersTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert ongoingOrdersTab != null : "fx:id=\"ongoingOrdersTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert completedOrdersTab != null : "fx:id=\"completedOrdersTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert transactionsTab != null : "fx:id=\"transactionsTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert employeeListTab != null : "fx:id=\"employeeListTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert companyDirTab != null : "fx:id=\"companyDirTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";

    }
}
