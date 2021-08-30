package application.Scenes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

public class ManageEmployeeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private String selectedDesignation;
    private String selectedLocation;

    public void setSelectedDesignation(String selectedDesignation) {
        this.selectedDesignation = selectedDesignation;
    }

    public void setSelectedLocation(String selectedLocation) {
        this.selectedLocation = selectedLocation;
    }

    @FXML
    void initialize() {

    }
}
