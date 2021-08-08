package application.User.Customer;

import java.io.Serializable;

import application.Database.DataRetrievable;
import application.Database.DatabaseManipulator;
import application.User.User;
import application.User.Employee.Employee;
import application.User.Employee.Designer.Designer;

public class Customer extends User implements Serializable {

    public Customer(String emailFromField, String userIDFromField, String passFromField) {
        email = emailFromField;
        id = userIDFromField;
        password = passFromField;
    }
    public Customer(String userIDFromField) {
        this.getClass().cast(DatabaseManipulator.getUserDataFromDatabase(id, "src/application/Database/Customers.bin"));
        
    }
    private Employee assignedEmp;
    private Designer assignedDes;

}
