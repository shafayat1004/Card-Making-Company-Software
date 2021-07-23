package SigninSignUp.Login;

public class Login {
    String emailFromButton, passwordFromButton, confirmedPasswordFromButton, userIDFromButton;

    public boolean ifEmailExists(String email) {
        //TODO check database for email
        return true;
    }
    public boolean ifIDExists(String id){
        //TODO Check ID from list
        return true;
    }
    public boolean ifPassMatchesForID(String id, String pass){
        //TODO Check ID from list and check if Password matches
        return true;
    }
    public void verifyLogin() {
        if (ifIDExists(userIDFromButton)){
            if (ifPassMatchesForID(userIDFromButton, passwordFromButton)){
                //TODO grant access
            }
            else{
                //TODO alert that pass doesnt match
            }
        }
        else{
            //TODO Alert that ID doesnt exist and offer signup
        }
    }
    public void signup() {
        if(ifEmailExists(emailFromButton) == false){
            if (passwordFromButton == confirmedPasswordFromButton){
                if (ifIDExists(userIDFromButton) == false){
                    //TODO add email and id and password to database
                }
                else{
                    //TODO Alert for new id.
                }
            }
            else{
                //TODO passwords doesnt match alert.
            }
        }
        else{
            //TODO alert that email exists offer login
        }
    }
}
