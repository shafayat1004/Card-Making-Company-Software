package application;
import application.User.Employee.Supervisor.Supervisor;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) throws Exception {
        Supervisor e1 = new Supervisor();
        e1.setName("Ononto Jolil");
        System.out.println(e1);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        
    }
}
