package application.User.Employee.CustomerService;

import java.util.ArrayList;

import application.Privilages.CustomerService.CSPrivilages;
import application.User.Customer.Customer;
import application.User.Employee.Employee;

public class CustomerService extends Employee implements CSPrivilages{
    private ArrayList<Customer> customersUnderEmp;

    public CustomerService(String userIDFromField) {
    }

    @Override
    public void viewCustomerPersonalisation() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void viewCustomerDetails() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void contactCustomer() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void contactDesigner() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void contactSupervisor() {
        // TODO Auto-generated method stub
        
    }
}
