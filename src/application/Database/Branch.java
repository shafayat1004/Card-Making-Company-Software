package application.Database;

import java.io.Serializable;
// import java.time.LocalDate;
import java.util.ArrayList;

public class Branch implements Serializable{
    
    private String upazillaOrCCorp; //Primary Field //not scalabale as it assumes only one branch per upazillaorCityCorp
    private String supervisorID; 
    private ArrayList<String> customerServiceIDs;
    private ArrayList<Integer> customersServedPerMonth;
    private ArrayList<Integer> expensesPerMonth;
    private ArrayList<Integer> revenuePerMonth;

    public Branch(String upazillaOrCCorp){
        this.upazillaOrCCorp = upazillaOrCCorp;
        customerServiceIDs = new ArrayList<String>();

       for (int i = 0; i < 12; i++) {
            customersServedPerMonth.add((Integer)(int)Math.floor(Math.random()*(500-200+1)+200));
            expensesPerMonth.add((Integer)(int)Math.floor(Math.random()*(20000-10000+1)+10000));
            revenuePerMonth.add((Integer)(int)Math.floor(Math.random()*(50000-15000+1)+15000));
       }
    }
    public Branch(String supervisorID, ArrayList<String> customerServiceIDs){
        this.supervisorID = supervisorID;
        this.customerServiceIDs = customerServiceIDs;
        
        for (int i = 0; i < 12; i++) {
            customersServedPerMonth.add((Integer)(int)Math.floor(Math.random()*(500-200+1)+200));
            expensesPerMonth.add((Integer)(int)Math.floor(Math.random()*(20000-10000+1)+10000));
            revenuePerMonth.add((Integer)(int)Math.floor(Math.random()*(50000-15000+1)+15000));
        }

    }
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
    // public int getCurrentMonthCustomerServed() {
    //     LocalDate currDate = LocalDate.now();
    //     int currMonth = currDate.getMonthValue();
    //     return customersServedPerMonth[currMonth-1];
    // }   
    // public int getCurrentMonthExpenses() {
    //     LocalDate currDate = LocalDate.now();
    //     int currMonth = currDate.getMonthValue();
    //     return expensesPerMonth[currMonth-1];
    // }
    // public int getCurrentMonthRevenue(){
    //     LocalDate currDate = LocalDate.now();
    //     int currMonth = currDate.getMonthValue();
    //     return revenuePerMonth[currMonth-1];
    // }
    public int getExpensesOfMonth(int monthNo) {
        return expensesPerMonth.get(monthNo-1);
    }
    public int getRevenueOfMonth(int monthNo) {
        return revenuePerMonth.get(monthNo-1);
    }
    public int getCustomersServedOfMonth(int monthNo) {
        return customersServedPerMonth.get(monthNo-1);
    }
    // public void addExpensesOfMonth(int monthNo, int addedExpense) {
    //     expensesPerMonth.get(monthNo-1) += addedExpense;
    // }
    // public void addRevenueOfMonth(int monthNo, int addedRevenue) {
    //     revenuePerMonth.get(monthNo-1) += addedRevenue;
    // }
    // public void addCustomersServedOfMonth(int monthNo, int addedCustomers) {
    //     customersServedPerMonth.get(monthNo-1) += addedCustomers;
    // }

}
