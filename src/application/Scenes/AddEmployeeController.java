package application.Scenes;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ResourceBundle;

import application.Assets.Assets;
import application.Database.DatabaseManipulator;
import application.Database.Address.Address;
import application.User.Owner.Owner;
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
    private String selectedDesignation;
    private String selectedLocation;
    private File imageFile;

    public void setSelectedDesignation(String selectedDesignation) {
        this.selectedDesignation = selectedDesignation;
    }

    public void setSelectedLocation(String selectedLocation) {
        this.selectedLocation = selectedLocation;
    }

    private static String[] imgExtensions = {"*.png", "*.PNG", "*.jpg", "*.JPG", "*.jpeg"};
    
    public boolean allTxtFieldsFilled(){
        return (nameField.getText()==null || emailField.getText()==null || mobileNoField.getText()==null || nidField.getText()==null 
                    || houseDetailsField.getText()==null || streetDetailsField.getText()==null || blockAndAreaField.getText()==null 
                    || upazillaCCorpField.getText()==null || districtField.getText()==null || divisionField.getText()==null);
    }

    @FXML
    void addEmployeeButtonOnClick(ActionEvent event) {
        System.out.println(selectedDesignation);

        if(nameField.getText().isBlank() || mobileNoField.getText().isBlank() || nidField.getText().isBlank() || emailField.getText().isBlank() 
            || blockAndAreaField.getText().isBlank() || districtField.getText().isBlank() || upazillaCCorpField.getText().isBlank() 
            || divisionField.getText().isBlank() || imageArea.getImage() == null
        )
        {
            showWarningAlert("Incomplete Fields", "Some Important Fields Are Empty");
            return;
        }
        
        String[] idAndPass = ((Owner)DatabaseManipulator.getCurrentUser()).hire(selectedDesignation, nameField.getText(), mobileNoField.getText(), nidField.getText()
        , emailField.getText(), imageArea.getImage().getUrl().toString());
        
        Address empAddress = new Address(idAndPass[0], houseDetailsField.getText(), streetDetailsField.getText()
        , blockAndAreaField.getText(), districtField.getText(), upazillaCCorpField.getText(), divisionField.getText());
        
        DatabaseManipulator.writeToDatabase(Assets.addressesFilePath, empAddress, true);
        
        genIDLabel.setText(idAndPass[0]);
        genPassLabel.setText(idAndPass[1]);
        

        File imageSavePath = new File(Assets.imageSavePath + idAndPass[0]);
        try {
            Files.copy(imageFile.toPath(), imageSavePath.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @FXML
    void addPictureButtonOnClick(ActionEvent event) {
        FileChooser imgChooser = new FileChooser();
        imgChooser.getExtensionFilters().add(new ExtensionFilter("Image Files", imgExtensions));
        imageFile = imgChooser.showOpenDialog(null);

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
