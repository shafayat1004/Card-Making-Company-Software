package Employee;

import Address.Address;
import Email.Email;

public class Employee {
    Address empAddress;
    int id;
    String name, mobileNum;
    //Email empEmail;
    @Override
    public String toString() {
        return "Employee [name= "+name+", id= " + id + ", mobileNum= " + mobileNum + ", empAddress= " + empAddress + "]";
    }

    
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobileNum() {
        return mobileNum;
    }
    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Address getEmpAddress() {
        return empAddress;
    }
    public void setEmpAddress(Address empAddress) {
        this.empAddress = empAddress;
    }
    public Employee() {
        name = new String("N/A");
        mobileNum= new String("N/A");
        empAddress = new Address("N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A");
        id = 0;
    }

    
}
