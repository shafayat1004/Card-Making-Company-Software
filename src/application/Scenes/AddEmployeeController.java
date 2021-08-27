package application.Scenes;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import application.Database.Address.Address;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class AddEmployeeController extends DashboardOwnerController{

    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private TextField nameField;
    @FXML private TextField emailField;
    @FXML private TextField mobileNoField;
    @FXML private TextField nidField;
    @FXML private TextField houseDetailsField;
    @FXML private TextField streetDetailsField;
    @FXML private TextField blockAndAreaField;
    @FXML private TextField upazillaCCorpField;
    @FXML private TextField districtField;
    @FXML private TextField divisionField;
    @FXML private ImageView imageArea;
    @FXML private Button addPictureButton;
    @FXML private Button addEmployeeButton;

    @FXML private Label genIDLabel;
    @FXML private Label genPassLabel;

    private static String[] imgExtensions = {"*.png", "*.PNG", "*.jpg", "*.JPG", "*.jpeg"};
    
    public boolean allTxtFieldsFilled(){
        return (nameField.getText()==null || emailField.getText()==null || mobileNoField.getText()==null || nidField.getText()==null 
                    || houseDetailsField.getText()==null || streetDetailsField.getText()==null || blockAndAreaField.getText()==null 
                    || upazillaCCorpField.getText()==null || districtField.getText()==null || divisionField.getText()==null);
    }

    @FXML
    void addEmployeeButtonOnClick(ActionEvent event) {
        //if(allTxtFieldsFilled()) {

            String[] idPass = currentUser.hireSupervisor(nameField.getText(), mobileNoField.getText(), nidField.getText()
            , emailField.getText(), imageArea.getImage());

            Address empAddress = new Address(idPass[0], houseDetailsField.getText(), streetDetailsField.getText()
            , blockAndAreaField.getText(), districtField.getText(), upazillaCCorpField.getText(), divisionField.getText());
            
            genIDLabel.setText(idPass[0]);
            genPassLabel.setText(idPass[1]);
        //}
        
    }

    @FXML
    void addPictureButtonOnClick(ActionEvent event) {
        FileChooser imgChooser = new FileChooser();
        imgChooser.getExtensionFilters().add(new ExtensionFilter("Image Files", imgExtensions));
        File imageFile = imgChooser.showOpenDialog(null);
        if (imageFile!=null) {
            imageArea.setDisable(false);
            imageArea.setImage(new Image(imageFile.toURI().toString()));
        }
    }

    @FXML
    void initialize() {
        assert nameField != null : "fx:id=\"nameField\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert emailField != null : "fx:id=\"emailField\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert mobileNoField != null : "fx:id=\"mobileNoField\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert nidField != null : "fx:id=\"nidField\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert houseDetailsField != null : "fx:id=\"houseDetailsField\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert streetDetailsField != null : "fx:id=\"streetDetailsField\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert blockAndAreaField != null : "fx:id=\"blockAndAreaField\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert upazillaCCorpField != null : "fx:id=\"upazillaCCorpField\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert districtField != null : "fx:id=\"districtField\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert divisionField != null : "fx:id=\"divisionField\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert imageArea != null : "fx:id=\"imageArea\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert addPictureButton != null : "fx:id=\"addPictureButton\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert addEmployeeButton != null : "fx:id=\"addEmployeeButton\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert genIDLabel != null : "fx:id=\"genIDLabel\" was not injected: check your FXML file 'AddEmployee.fxml'.";
        assert genPassLabel != null : "fx:id=\"genPassLabel\" was not injected: check your FXML file 'AddEmployee.fxml'.";
    }
}
