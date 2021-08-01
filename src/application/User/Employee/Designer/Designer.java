package application.User.Employee.Designer;

import java.util.ArrayList;

import application.Database.dataRetrievable;
import application.User.Customer.Customer;
import application.User.Employee.Employee;

public class Designer extends Employee implements dataRetrievable{
    public Designer(String userIDFromField) {
        retreiveAndSetAllData(userIDFromField);
        setId(userIDFromField); //temporary
    }

    private ArrayList<Customer> customersUnderEmp;

    @Override
    public void retreiveAndSetAllData(String id) {
        //TODO retrieve from database all info about user.        
    }
}
