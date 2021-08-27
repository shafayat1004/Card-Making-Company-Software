package application.User;

import java.io.Serializable;

import application.Assets.Assets;
import application.Database.DatabaseManipulator;
import application.Database.Address.Address;
import javafx.scene.image.Image;

public abstract class User implements Serializable{
    protected String name, mobileNum, id, nationalID, email, password;
    protected Image dp;

    public User(String name, String mobileNum, String id, String nationalID, String email, String password, Image dp) {
        this.name = name;
        this.mobileNum = mobileNum;
        this.id = id;
        this.nationalID = nationalID;
        this.email = email;
        this.password = password;
        this.dp = dp;
    }

    public User(String id) {
        this.id = id;
    }
    
    public User(String email, String id, String password) {
        this.email = email;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", id=" + id + ", mobileNum=" + mobileNum + ", name=" + name + ", password="
                + password + "]";
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
    // public Address getUsrAddress() {
    //     return DatabaseManipulator.get;
    // }
    public void setUsrAddress(Address usrAddress) {
        DatabaseManipulator.writeToDatabase(Assets.getAddressesFilePath(), usrAddress, true);
    }
}
