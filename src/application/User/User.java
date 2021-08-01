package application.User;

import application.Address.Address;

public abstract class User {
    private Address usrAddress;
    private int id;
    private String name, mobileNum;
    //Email empEmail;
    @Override
    public String toString() {
        return "User [name= "+name+", id= " + id + ", mobileNum= " + mobileNum + ", usrAddress= " + usrAddress + "]";
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
    public Address getUsrAddress() {
        return usrAddress;
    }
    public void setUsrAddress(Address usrAddress) {
        this.usrAddress = usrAddress;
    }
    public User() {
        name = new String("N/A");
        mobileNum= new String("N/A");
        usrAddress = new Address("N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A");
        id = 0;
    }
}
