package application.Scenes;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

import application.Database.DatabaseManipulator;
import application.Order.Order;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class NewOrdersController extends Controller{

    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private VBox orderActionsVBox;
    @FXML private TextArea customerNoteTextArea;
    @FXML private Button viewDetailsButton;
    @FXML private Button rejectButton;
    @FXML private CheckBox giveCauseChkBox;
    @FXML private TextArea rejectCauseTextArea;
    @FXML private Button assignCSEmpButton;
    @FXML private CheckBox csEmpChkBox;
    @FXML private Button assignDesignerButton;
    @FXML private CheckBox designerChkBox;
    @FXML private Button acceptButton;
    @FXML private Button refreshButton;

    @FXML private TableView<Order> newOrderTableView;
    @FXML private TableColumn<Order, String> orderIDCol;
    @FXML private TableColumn<Order, LocalDateTime> orderedOnCol;
    @FXML private TableColumn<Order, String> branchCol;
    @FXML private TableColumn<Order, String> customerIDCol;
    @FXML private TableColumn<Order, String> orderTypeCol;
    @FXML private TableColumn<Order, Integer> orderQuantityCol;
    @FXML private TableColumn<Order, String> fileNameCol;
    @FXML private TableColumn<Order, LocalDate> deliverByCol;

    @FXML
    void refreshButtonOnClick(ActionEvent event) {

        ObservableList<Order> orderList = DatabaseManipulator.getOrderListFromDatabase();
        orderIDCol.setCellValueFactory(new PropertyValueFactory<Order, String>("orderID"));
        orderedOnCol.setCellValueFactory(new PropertyValueFactory<Order, LocalDateTime>("orderedOn"));
        branchCol.setCellValueFactory(new PropertyValueFactory<Order, String>("deliverTo"));
        customerIDCol.setCellValueFactory(new PropertyValueFactory<Order, String>("customerID"));
        orderTypeCol.setCellValueFactory(new PropertyValueFactory<Order, String>("orderType"));
        orderQuantityCol.setCellValueFactory(new PropertyValueFactory<Order, Integer>("orderQuantity"));
        fileNameCol.setCellValueFactory(new PropertyValueFactory<Order, String>("fileName"));
        deliverByCol.setCellValueFactory(new PropertyValueFactory<Order, LocalDate>("deliverBy"));

        newOrderTableView.setItems(orderList);
    }
    
    @FXML
    void acceptButtonOnClick(ActionEvent event) {
        if (csEmpChkBox.isSelected() && designerChkBox.isSelected()) {
            //TODO add order
        } else {
            showWarningAlert("Employees Not Assigned", "Please Assign Designer and Customer Service Employees to this order.");
        }
    }

    @FXML
    void assignCSEmpButtonOnClick(ActionEvent event) {

    }

    @FXML
    void assignDesignerButtonOnClick(ActionEvent event) {

    }

    @FXML
    void giveCauseChkBoxOnSelection(ActionEvent event) {
        if (giveCauseChkBox.isSelected()) {
            rejectCauseTextArea.setDisable(false);
        } else {
            rejectCauseTextArea.setDisable(true);            
        }
    }

    @FXML
    void rejectButtonOnClick(ActionEvent event) {

    }

    @FXML
    void viewDetailsButtonOnClick(ActionEvent event) {

    }

    @FXML
    void initialize() {
        

        assert orderActionsVBox != null : "fx:id=\"orderActionsVBox\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert customerNoteTextArea != null : "fx:id=\"customerNoteTextArea\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert viewDetailsButton != null : "fx:id=\"viewDetailsButton\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert rejectButton != null : "fx:id=\"rejectButton\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert giveCauseChkBox != null : "fx:id=\"giveCauseChkBox\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert rejectCauseTextArea != null : "fx:id=\"rejectCauseTextArea\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert assignCSEmpButton != null : "fx:id=\"assignCSEmpButton\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert csEmpChkBox != null : "fx:id=\"csEmpChkBox\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert assignDesignerButton != null : "fx:id=\"assignDesignerButton\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert designerChkBox != null : "fx:id=\"designerChkBox\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert acceptButton != null : "fx:id=\"acceptButton\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert newOrderTableView != null : "fx:id=\"newOrderTableView\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert orderIDCol != null : "fx:id=\"orderIDCol\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert orderedOnCol != null : "fx:id=\"orderedOnCol\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert branchCol != null : "fx:id=\"branchCol\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert customerIDCol != null : "fx:id=\"customerIDCol\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert orderTypeCol != null : "fx:id=\"orderTypeCol\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert orderQuantityCol != null : "fx:id=\"orderQuantityCol\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert fileNameCol != null : "fx:id=\"fileNameCol\" was not injected: check your FXML file 'NewOrders.fxml'.";
        assert deliverByCol != null : "fx:id=\"deliverByCol\" was not injected: check your FXML file 'NewOrders.fxml'.";

    }
}
