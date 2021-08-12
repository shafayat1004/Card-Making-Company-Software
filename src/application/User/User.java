package application.User;

import java.io.Serializable;

import application.Database.Address.Address;

public abstract class User implements Serializable{
    public User(String id) {
        this.id = id;
    }
    protected Address usrAddress;
    protected String name, mobileNum, id, email, password;
    
    public User(String email, String id, String password) {
        this.email = email;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", id=" + id + ", mobileNum=" + mobileNum + ", name=" + name + ", password="
                + password + ", usrAddress=" + usrAddress + "]";
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
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
