package application.Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.User.Owner.Owner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;

public class DashboardOwnerController extends Controller{

    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private Label idLabel;
    @FXML private Label nameLabel;
    @FXML private Button signoutButton;

    @FXML private Tab financialsTab;
    @FXML private Tab noticeTab;
    @FXML private Tab empManagementTab;
    @FXML private Tab personalInfoTab;
    @FXML private Tab companyDirTab;
    @FXML private Tab customerDirTab;
    @FXML private Tab newOrdersTab;
    @FXML private Tab ongoingOrdersTab;
    @FXML private Tab completedOrdersTab;
    @FXML private Tab complaintsTab;

    private Owner currentUser;

    public Owner getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Owner currentUser) {
        this.currentUser = currentUser;
        idLabel.setText("ID: " + currentUser.getId());
    }

    @FXML
    void signoutButtonOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "WelcomeScene.fxml");
    }

    @FXML
    void initialize() {

        assert signoutButton != null : "fx:id=\"signoutButton\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert financialsTab != null : "fx:id=\"financialsTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert noticeTab != null : "fx:id=\"noticeTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert empManagementTab != null : "fx:id=\"empManagementTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert personalInfoTab != null : "fx:id=\"personalInfoTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert companyDirTab != null : "fx:id=\"companyDirTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert customerDirTab != null : "fx:id=\"customerDirTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert newOrdersTab != null : "fx:id=\"newOrdersTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert ongoingOrdersTab != null : "fx:id=\"ongoingOrdersTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert completedOrdersTab != null : "fx:id=\"completedOrdersTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert complaintsTab != null : "fx:id=\"complaintsTab\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert idLabel != null : "fx:id=\"idLabel\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
        assert nameLabel != null : "fx:id=\"nameLabel\" was not injected: check your FXML file 'DashboardOwner.fxml'.";
    }
}
