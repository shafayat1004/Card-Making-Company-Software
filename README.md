## Simulating Operations of a Stationary, Card maker company
Project work of CSC305 IUB.

### 2021-08-09 3:19AM Update:
Null Pointer exception while trying to crosscheck for existence in database.
java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because the return value of "application.User.User.getEmail()" is null
        at application.Database.DatabaseManipulator.existsInDatabase(DatabaseManipulator.java:131)
        at application.Scenes.Controller.emailExistsInDatabase(Controller.java:87)
        at application.Scenes.SignupController.signup(SignupController.java:33)
        at application.Scenes.SignupController.signupCheckButtonOnClick(SignupController.java:78)
