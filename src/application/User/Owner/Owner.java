package application.User.Owner;

import application.Assets.Assets;
import application.Database.Credentials;
import application.Database.DatabaseManipulator;
import application.Privilages.CustomerService.CSPrivilages;
import application.Privilages.Supervisor.SupervisorPrivilages;
import application.User.User;
import application.User.Employee.Supervisor.Supervisor;
import javafx.scene.image.Image;

public class Owner extends User implements SupervisorPrivilages, CSPrivilages{

    public Owner(String userIDFromField) {

        super(userIDFromField); //temporary
    }

    public Owner(String email, String id, String password) {
        super(email, id, password);
    }



    public String[] hireSupervisor(String name, String mobileNum, String nationalID, String email, Image dp) {
        
        String genPass = ((Integer)(int)Math.floor(Math.random()*(9999999-1000000+1)+1000000)).toString();
        String genID = ((Integer)(DatabaseManipulator.getCount(Assets.getSupervisorFilePath()) + 1)).toString();

        Supervisor newSupervisor = new Supervisor(name, mobileNum, genID, nationalID, email, genPass, dp);
        DatabaseManipulator.writeToDatabase(Assets.getSupervisorFilePath(), newSupervisor, true);
        Credentials credentials = new Credentials(email, genID, genPass, Assets.getUserTypes()[2]);
        DatabaseManipulator.writeToDatabase(Assets.getCredentialsFilePath(), credentials, true);

        return new String[]{genID, genPass};
        
    }


    public void fireSupervisor() {
        // TODO Auto-generated method stub
        
    }


    public void hireDesigner() {
        // TODO Auto-generated method stub
        
    }


    public void fireDesigner() {
        // TODO Auto-generated method stub
        
    }


    public void checkFinancials() {
        // TODO Auto-generated method stub
        
    }


    public void paySalaryToSupervisor() {
        // TODO Auto-generated method stub
        
    }

    public void paySalaryToSupervisorForCSEmployees() {
        // TODO Auto-generated method stub
        
    }

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
