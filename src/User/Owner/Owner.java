package User.Owner;

import Privilages.CustomerService.CSPrivilages;
import Privilages.Owner.OwnerPrivilages;
import Privilages.Supervisor.SupervisorPrivilages;
import User.User;

public class Owner extends User implements OwnerPrivilages, SupervisorPrivilages, CSPrivilages{

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
    public void setMeetingWithSupervisor() {
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
    
}
