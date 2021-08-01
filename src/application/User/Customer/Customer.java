package application.User.Customer;

import application.Database.dataRetrievable;
import application.User.User;
import application.User.Employee.Employee;
import application.User.Employee.Designer.Designer;

public class Customer extends User implements dataRetrievable{

    
    public Customer(String userIDFromField) {
        retreiveAndSetAllData(userIDFromField);
        setId(userIDFromField); //temporary
    }
    private Employee assignedEmp;
    private Designer assignedDes;


    @Override
    public void retreiveAndSetAllData(String id) {
        //TODO retrieve from database all info about user.        
    }
}
