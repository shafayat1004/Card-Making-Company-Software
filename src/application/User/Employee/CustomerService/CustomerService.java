package application.User.Employee.CustomerService;

import java.util.ArrayList;

import application.Database.dataRetrievable;
import application.Privilages.CustomerService.CSPrivilages;
import application.User.Customer.Customer;
import application.User.Employee.Employee;

public class CustomerService extends Employee implements CSPrivilages, dataRetrievable{
    private ArrayList<Customer> customersUnderEmp;

    public CustomerService(String userIDFromField) {
        retreiveAndSetAllData(userIDFromField);
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

    @Override
    public void retreiveAndSetAllData(String id) {
        //TODO retrieve from database all info about user.        
    }
}
