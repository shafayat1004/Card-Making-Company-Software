package application.User.Employee.Designer;

import java.util.ArrayList;
import application.User.Customer.Customer;
import application.User.Employee.Employee;
import javafx.scene.image.Image;



public class Designer extends Employee{
    public Designer(String userIDFromField) {
       
        super(userIDFromField); //temporary
    }

    public Designer(String name, String mobileNum, String id, String nationalID, String email, String password, Image dp) {
        super(name, mobileNum, id, nationalID, email, password, dp);
    }

    private ArrayList<Customer> customersUnderEmp;

}
