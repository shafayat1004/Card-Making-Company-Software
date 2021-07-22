package User.Employee.Supervisor;

import java.util.ArrayList;

import Privilages.CustomerService.CSPrivilages;
import Privilages.Supervisor.SupervisorPrivilages;
import User.Employee.Employee;
import User.Employee.CustomerService.CustomerService;

public class Supervisor extends Employee implements SupervisorPrivilages, CSPrivilages{
    ArrayList<CustomerService> CSEmpUnderSup;

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
