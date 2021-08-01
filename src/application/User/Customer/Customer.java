package application.User.Customer;

import application.User.User;
import application.User.Employee.Employee;
import application.User.Employee.Designer.Designer;

public class Customer extends User{
    public Customer(String userIDFromField) {
    }
    private Employee assignedEmp;
    private Designer assignedDes;
}
