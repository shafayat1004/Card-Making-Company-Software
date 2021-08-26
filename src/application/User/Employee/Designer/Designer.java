package application.User.Employee.Designer;

import java.util.ArrayList;
import application.User.Customer.Customer;
import application.User.Employee.Employee;



public class Designer extends Employee{
    public Designer(String userIDFromField) {
       
        super(userIDFromField); //temporary
    }

    private ArrayList<Customer> customersUnderEmp;

}
