## Simulating Operations of a Stationary, Card maker company
Project work of CSC305 IUB.

### 2021-08-09 3:19AM Update:
Null Pointer exception while trying to crosscheck for existence in database.
java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because the return value of "application.User.User.getEmail()" is null
        at application.Database.DatabaseManipulator.existsInDatabase(DatabaseManipulator.java:131)
        at application.Scenes.Controller.emailExistsInDatabase(Controller.java:87)
        at application.Scenes.SignupController.signup(SignupController.java:33)
        at application.Scenes.SignupController.signupCheckButtonOnClick(SignupController.java:78)


### 2021-08-11 1:30AM Update:
the exception was taken care of. Created a Credentials database that would be checked from now. Any signup will create two files now. Customers.bin and Credentials.bin
All the Login and Signin verifications are now (hopefully) handled.

Next plan: 
1. Retrieve user instance from the respective user database and show it on Dashboard.
2. Start working on individual tabs UIs.
3. Fill in some user privelage methods. [priority to: adding Employees]