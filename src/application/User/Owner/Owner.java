package application.User.Owner;

import application.Privilages.CustomerService.CSPrivilages;
import application.Privilages.Owner.OwnerPrivilages;
import application.Privilages.Supervisor.SupervisorPrivilages;
import application.User.User;

public class Owner extends User implements OwnerPrivilages, SupervisorPrivilages, CSPrivilages{

    public Owner(String userIDFromField) {
    }

    @Override
    public void hireSupervisor() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fireSupervisor() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void hireDesigner() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fireDesigner() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void checkFinancials() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void paySalaryToSupervisor() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void paySalaryToSupervisorForCSEmployees() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void modifySalary() {
        // TODO Auto-generated method stub
        
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
    
}
