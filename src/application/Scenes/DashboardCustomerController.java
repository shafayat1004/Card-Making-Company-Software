package application.Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;

public class DashboardCustomerController extends SceneChanger{

    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private Button signoutButton;
    @FXML private Label idLabel;
    @FXML private Label nameLabel;
    @FXML private Label locationLabel;

    @FXML private Tab noticeTab;
    @FXML private Tab createNewOrderTab;
    @FXML private Tab myOrderStatusTab;
    @FXML private Tab fileComplaintTab;
    @FXML private Tab personalInfoTab;

    @FXML
    void signoutButtonOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "WelcomeScene.fxml");
    }
    
    @FXML
    void initialize() {
        assert signoutButton != null : "fx:id=\"signoutButton\" was not injected: check your FXML file 'DashboardCustomer.fxml'.";
        assert idLabel != null : "fx:id=\"idLabel\" was not injected: check your FXML file 'DashboardCustomer.fxml'.";
        assert nameLabel != null : "fx:id=\"nameLabel\" was not injected: check your FXML file 'DashboardCustomer.fxml'.";
        assert locationLabel != null : "fx:id=\"locationLabel\" was not injected: check your FXML file 'DashboardCustomer.fxml'.";
        assert noticeTab != null : "fx:id=\"noticeTab\" was not injected: check your FXML file 'DashboardCustomer.fxml'.";
        assert createNewOrderTab != null : "fx:id=\"createNewOrderTab\" was not injected: check your FXML file 'DashboardCustomer.fxml'.";
        assert myOrderStatusTab != null : "fx:id=\"myOrderStatusTab\" was not injected: check your FXML file 'DashboardCustomer.fxml'.";
        assert fileComplaintTab != null : "fx:id=\"fileComplaintTab\" was not injected: check your FXML file 'DashboardCustomer.fxml'.";
        assert personalInfoTab != null : "fx:id=\"personalInfoTab\" was not injected: check your FXML file 'DashboardCustomer.fxml'.";

    }
}
