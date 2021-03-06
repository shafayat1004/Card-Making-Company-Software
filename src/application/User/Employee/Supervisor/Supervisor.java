package application.User.Employee.Supervisor;


import java.util.ArrayList;

import application.Privilages.CustomerService.CSPrivilages;
import application.Privilages.Supervisor.SupervisorPrivilages;
import application.User.Employee.Employee;
import application.User.Employee.CustomerService.CustomerService;

public class Supervisor extends Employee implements SupervisorPrivilages, CSPrivilages{
    
    private ArrayList<CustomerService> cSEmpUnderSup;
    
    public Supervisor(String userIDFromField){
        
        super(userIDFromField); //temporary
    }
    public Supervisor(String name, String mobileNum, String id, String nationalID, String email, String password, String imagePath){
        super(name, mobileNum, id, nationalID, email, password, imagePath);
    }
    
    public ArrayList<CustomerService> getCSEmpUnderSup() {
        return cSEmpUnderSup;
    }
    public void addCSEmpUnderSup(CustomerService cSEmpToAdd) {
        cSEmpUnderSup.add(cSEmpToAdd);
    }
    
    @Override
    public void paySalaryToCSEmployees() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sendTransactionDetailsToServer() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void assignCSEmp2Cus() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void assignDes2Cus() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void viewComplaints() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void viewTransactionHistory() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void viewCusAssigned2CSEmp() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void viewCusAssigned2Des() {
        // TODO Auto-generated method stub
        
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
    public void viewNewOrders() {
        // TODO Auto-generated method stub
        
    }
}
