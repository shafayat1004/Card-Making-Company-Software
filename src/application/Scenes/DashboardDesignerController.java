package application.Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;

public class DashboardDesignerController extends SceneChanger{

    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private Button signoutButton;
    @FXML private Label idLabel;
    @FXML private Label nameLabel;

    @FXML private Tab noticeTab;
    @FXML private Tab myCustomersTab;
    @FXML private Tab myOngoingOrdersTab;
    @FXML private Tab myCompletedOrdersTab;
    @FXML private Tab myRequestsTab;
    @FXML private Tab companyDirTab;
    @FXML private Tab personalInfoTab;

    @FXML
    void signoutButtonOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "..\\WelcomeScene.fxml");
    }
    @FXML
    void initialize() {
        assert signoutButton != null : "fx:id=\"signoutButton\" was not injected: check your FXML file 'DashboardDesigner.fxml'.";
        assert idLabel != null : "fx:id=\"idLabel\" was not injected: check your FXML file 'DashboardDesigner.fxml'.";
        assert nameLabel != null : "fx:id=\"nameLabel\" was not injected: check your FXML file 'DashboardDesigner.fxml'.";
        assert noticeTab != null : "fx:id=\"noticeTab\" was not injected: check your FXML file 'DashboardDesigner.fxml'.";
        assert myCustomersTab != null : "fx:id=\"myCustomersTab\" was not injected: check your FXML file 'DashboardDesigner.fxml'.";
        assert myOngoingOrdersTab != null : "fx:id=\"myOngoingOrdersTab\" was not injected: check your FXML file 'DashboardDesigner.fxml'.";
        assert myCompletedOrdersTab != null : "fx:id=\"myCompletedOrdersTab\" was not injected: check your FXML file 'DashboardDesigner.fxml'.";
        assert myRequestsTab != null : "fx:id=\"myRequestsTab\" was not injected: check your FXML file 'DashboardDesigner.fxml'.";
        assert companyDirTab != null : "fx:id=\"companyDirTab\" was not injected: check your FXML file 'DashboardDesigner.fxml'.";
        assert personalInfoTab != null : "fx:id=\"personalInfoTab\" was not injected: check your FXML file 'DashboardDesigner.fxml'.";

    }
}
