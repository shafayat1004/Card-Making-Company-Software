package application.Scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import application.Database.DatabaseManipulator;
import application.User.Employee.Supervisor.Supervisor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class DashboardSupervisorController extends Controller{

    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private Button signoutButton;
    @FXML private Label idLabel;
    @FXML private Label nameLabel;
    @FXML private Label locationLabel;
    @FXML private Tab noticeTab;
    @FXML private Tab newOrdersTab;
    @FXML private Tab ongoingOrdersTab;
    @FXML private Tab completedOrdersTab;
    @FXML private Tab transactionsTab;
    @FXML private Tab branchEmpListTab;
    @FXML private Tab designerListTab;
    @FXML private Tab personalInfoTab;
    @FXML private Tab complaintsTab;
    @FXML private BorderPane newOrdersBorderPane;
    private Supervisor currentUser;

    @FXML
    void signoutButtonOnClick(ActionEvent event) throws IOException {
        sceneChange(event, "WelcomeScene.fxml");
    }


    public void loadNewOrderUI(String fxmlfile) {
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlfile));
            root = loader.load();
            newOrdersBorderPane.setCenter(root);
        }
        catch (IOException ex) {
            Logger.getLogger(DashboardOwnerController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    @FXML
    void newOrdersTabOnClick(ActionEvent event) {
        loadNewOrderUI("NewOrders.fxml");
    }


    @FXML private TextField expenseJan;
    @FXML private TextField expenseFeb;
    @FXML private TextField expenseMar;
    @FXML private TextField expenseApril;
    @FXML private TextField expenseMay;
    @FXML private TextField expenseJune;
    @FXML private TextField expenseJuly;
    @FXML private TextField expenseAug;
    @FXML private TextField expenseSep;
    @FXML private TextField expenseOct;
    @FXML private TextField expenseNov;
    @FXML private TextField expenseDec;
    @FXML private TextField revenueJan;
    @FXML private TextField revenueFeb;
    @FXML private TextField revenueMar;
    @FXML private TextField revenueApr;
    @FXML private TextField revenueMay;
    @FXML private TextField revenueJune;
    @FXML private TextField revenueJuly;
    @FXML private TextField revenueAug;
    @FXML private TextField revenueSep;
    @FXML private TextField revenueOct;
    @FXML private TextField revenueNov;
    @FXML private TextField revenueDec;
    @FXML private TextField cusServedJan;
    @FXML private TextField cusServedFeb;
    @FXML private TextField cusServedMar;
    @FXML private TextField cusServedApr;
    @FXML private TextField cusServedMay;
    @FXML private TextField cusServedJune;
    @FXML private TextField cusServedJuly;
    @FXML private TextField cusServedAug;
    @FXML private TextField cusServedSep;
    @FXML private TextField cusServedOct;
    @FXML private TextField cusServedNov;
    @FXML private TextField cusServedDec;

    @FXML private Button addExpenseRevenue;

    @FXML
    void addExpenseRevenueOnClick(ActionEvent event) {
        //int[] expense = new int[]{}
        //currentUser.sendTransactionDetailsToServer();
    }

    @FXML
    void initialize() {

        currentUser = (Supervisor)DatabaseManipulator.getCurrentUser();
        idLabel.setText("ID: " + currentUser.getId());
        nameLabel.setText("Name: " + currentUser.getName());



        assert locationLabel != null : "fx:id=\"locationLabel\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert nameLabel != null : "fx:id=\"nameLabel\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert idLabel != null : "fx:id=\"idLabel\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert signoutButton != null : "fx:id=\"signoutButton\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert noticeTab != null : "fx:id=\"noticeTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert newOrdersTab != null : "fx:id=\"newOrdersTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert newOrdersBorderPane != null : "fx:id=\"newOrdersBorderPane\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert ongoingOrdersTab != null : "fx:id=\"ongoingOrdersTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert completedOrdersTab != null : "fx:id=\"completedOrdersTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert transactionsTab != null : "fx:id=\"transactionsTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert expenseJan != null : "fx:id=\"expenseJan\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert expenseFeb != null : "fx:id=\"expenseFeb\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert expenseMar != null : "fx:id=\"expenseMar\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert expenseApril != null : "fx:id=\"expenseApril\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert expenseMay != null : "fx:id=\"expenseMay\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert expenseJune != null : "fx:id=\"expenseJune\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert expenseJuly != null : "fx:id=\"expenseJuly\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert expenseAug != null : "fx:id=\"expenseAug\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert expenseSep != null : "fx:id=\"expenseSep\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert expenseOct != null : "fx:id=\"expenseOct\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert expenseNov != null : "fx:id=\"expenseNov\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert expenseDec != null : "fx:id=\"expenseDec\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert revenueJan != null : "fx:id=\"revenueJan\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert revenueFeb != null : "fx:id=\"revenueFeb\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert revenueMar != null : "fx:id=\"revenueMar\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert revenueApr != null : "fx:id=\"revenueApr\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert revenueMay != null : "fx:id=\"revenueMay\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert revenueJune != null : "fx:id=\"revenueJune\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert revenueJuly != null : "fx:id=\"revenueJuly\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert revenueAug != null : "fx:id=\"revenueAug\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert revenueSep != null : "fx:id=\"revenueSep\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert revenueOct != null : "fx:id=\"revenueOct\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert revenueNov != null : "fx:id=\"revenueNov\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert revenueDec != null : "fx:id=\"revenueDec\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert cusServedJan != null : "fx:id=\"cusServedJan\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert cusServedFeb != null : "fx:id=\"cusServedFeb\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert cusServedMar != null : "fx:id=\"cusServedMar\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert cusServedApr != null : "fx:id=\"cusServedApr\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert cusServedMay != null : "fx:id=\"cusServedMay\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert cusServedJune != null : "fx:id=\"cusServedJune\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert cusServedJuly != null : "fx:id=\"cusServedJuly\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert cusServedAug != null : "fx:id=\"cusServedAug\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert cusServedSep != null : "fx:id=\"cusServedSep\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert cusServedOct != null : "fx:id=\"cusServedOct\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert cusServedNov != null : "fx:id=\"cusServedNov\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert cusServedDec != null : "fx:id=\"cusServedDec\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert addExpenseRevenue != null : "fx:id=\"addExpenseRevenue\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert branchEmpListTab != null : "fx:id=\"branchEmpListTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert designerListTab != null : "fx:id=\"designerListTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert personalInfoTab != null : "fx:id=\"personalInfoTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";
        assert complaintsTab != null : "fx:id=\"complaintsTab\" was not injected: check your FXML file 'DashboardSupervisor.fxml'.";


    }
}
