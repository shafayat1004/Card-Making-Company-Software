package application.User.Employee;

import application.User.User;


public abstract class Employee extends User{

    public Employee(String email, String id, String password) {
        super(email, id, password);
    }

    public Employee(String id) {
        super(id);
    }
    public Employee(String name, String mobileNum, String id, String nationalID, String email, String password, String imagePath) {
        super(name, mobileNum, id, nationalID, email, password, imagePath);
    }
    
}
