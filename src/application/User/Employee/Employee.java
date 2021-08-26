package application.User.Employee;

import application.User.User;


public abstract class Employee extends User{

    public Employee(String email, String id, String password) {
        super(email, id, password);
    }

    public Employee(String id) {
        super(id);
    }
    
}
