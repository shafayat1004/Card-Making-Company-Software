package application.User.Employee.CustomerService;

import java.io.Serializable;
import java.util.ArrayList;

import application.Database.DataRetrievable;
import application.Privilages.CustomerService.CSPrivilages;
import application.User.Customer.Customer;
import application.User.Employee.Employee;

public class CustomerService extends Employee implements CSPrivilages, Serializable{
    private ArrayList<Customer> customersUnderEmp;

    public CustomerService(String userIDFromField) {

        setId(userIDFromField); //temporary
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
