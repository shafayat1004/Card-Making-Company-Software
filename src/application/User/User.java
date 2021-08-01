package application.User;

import application.Address.Address;

public abstract class User {
    private Address usrAddress;
    private String name, mobileNum, id;
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
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Address getUsrAddress() {
        return usrAddress;
    }
    public void setUsrAddress(Address usrAddress) {
        this.usrAddress = usrAddress;
    }
}
