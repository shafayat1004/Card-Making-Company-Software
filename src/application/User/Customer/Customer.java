package application.User.Customer;

import java.io.Serializable;

import application.Database.DataRetrievable;
import application.Database.DatabaseManipulator;
import application.User.User;
import application.User.Employee.Employee;
import application.User.Employee.Designer.Designer;

public class Customer extends User implements Serializable {

    public Customer(String emailFromField, String userIDFromField, String passFromField) {
        super(emailFromField, userIDFromField, passFromField);
    }
    
    public Customer(String userIDFromField) {
        super(userIDFromField);
        this.getClass().cast(DatabaseManipulator.getCustomerDataFromDatabase(id));
        
    }
    private Employee assignedEmp;
    private Designer assignedDes;

}
