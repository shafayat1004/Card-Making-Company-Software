package application.Database;

import java.io.Serializable;

public class Credentials implements Serializable{

    private String email;
    private String id;
    private String password;
    private String userType;

    public Credentials(String email, String id, String password, String userType) {
        this.email = email;
        this.id = id;
        this.password = password;
        this.userType = userType;
    }
    
    @Override
    public String toString() {
        return "Credentials [email=" + email + ", id=" + id + ", password=" + password + ", userType=" + userType + "]";
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
