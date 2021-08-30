package application.Database;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Branch implements Serializable{
    private String supervisorID, upazillaOrCCorp; //not scalabale as it assumes only one branch per upazillaorCityCorp
    private ArrayList<String> customerServiceIDs;
    private int[] customersServedPerMonth;
    private ArrayList<Integer> expensesPerMonth;
    private ArrayList<Integer> revenuePerMonth;


    public String getSupervisorID() {
        return supervisorID;
    }
    public void setSupervisorID(String supervisorID) {
        this.supervisorID = supervisorID;
    }
    public String getUpazillaOrCCorp() {
        return upazillaOrCCorp;
    }
    public void setUpazillaOrCCorp(String upazillaOrCCorp) {
        this.upazillaOrCCorp = upazillaOrCCorp;
    }
    public void addCustomerService(String newCSEmpID) {
        customerServiceIDs.add(newCSEmpID);
    }
    public ArrayList<String> getCustomerServiceIDs() {
        return customerServiceIDs;
    }
    public void setCustomerServiceIDs(ArrayList<String> customerServiceIDs) {
        this.customerServiceIDs = customerServiceIDs;
    }
    public int getCurrentMonthCustomerServed() {
        LocalDate currDate = LocalDate.now();
        int currMonth = currDate.getMonthValue();
        return customersServedPerMonth[currMonth-1];
    }   
    

}
