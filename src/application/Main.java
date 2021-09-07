package application;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        URL welcomeScene = getClass().getResource("Scenes/WelcomeScene.fxml");
        Parent root = FXMLLoader.load(welcomeScene);
        Scene scene = new Scene(root);
        
        //String css = this.getClass().getResource("Scenes/appWideCSS.css").toExternalForm();
        //scene.getStylesheets().add(css);

        stage.setScene(scene);
        stage.setTitle("CompanyName Operations");
        stage.setMaximized(true);
        stage.show();
    }
}
