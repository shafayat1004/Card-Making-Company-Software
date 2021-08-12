package application.User.Employee;

import java.io.Serializable;

import application.User.User;
import application.User.Employee.Supervisor.Supervisor;

public abstract class Employee extends User implements Serializable{

    public Employee(String email, String id, String password) {
        super(email, id, password);
    }

    public Employee(String id) {
        super(id);
    }
    
}
