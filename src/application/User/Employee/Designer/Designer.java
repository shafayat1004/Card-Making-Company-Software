package application.User.Employee.Designer;

import java.io.Serializable;
import java.util.ArrayList;

import application.Database.DataRetrievable;
import application.User.Customer.Customer;
import application.User.Employee.Employee;

public class Designer extends Employee implements Serializable{
    public Designer(String userIDFromField) {
       
        super(userIDFromField); //temporary
    }

    private ArrayList<Customer> customersUnderEmp;

}
