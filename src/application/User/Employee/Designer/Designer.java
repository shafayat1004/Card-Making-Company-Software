package application.User.Employee.Designer;

import java.util.ArrayList;
import application.User.Customer.Customer;
import application.User.Employee.Employee;



public class Designer extends Employee{
    public Designer(String userIDFromField) {
       
        super(userIDFromField); //temporary
    }

    public Designer(String name, String mobileNum, String id, String nationalID, String email, String password, String imagePath) {
        super(name, mobileNum, id, nationalID, email, password, imagePath);
    }

    private ArrayList<Customer> customersUnderEmp;

}
