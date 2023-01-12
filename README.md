## Simulating Operations of a Stationary, Card maker company
Project work of CSC305 IUB.


Name: Mir Shafayat Ahmed

ID: 1910456

Section: 2

Topic: Simulating Operations of Azad/Ideal products.

Milestone- 1 Version- 2 (draft) Date: 16/07/2021

Users:

1.  Owner

    Functions:

    1.  See expenses, revenue, profit for the week, month, year.

        a.  Select "financials":

        b.  Show a

    2.  Assign Salaries of all employees.

    3.  Pay Salary.

    4.  Read complaints.

    5.  Contact with Supervisors.


2.  Shop Supervisor

    Functions:

    1.  Place Order for Paper/Ink from 3rd party supplier.

    2.  View Customer Personalization on samples.

    3.  Assign a designer and employee to a customer (with personalization
        details)

    4.  Receive payment from customer.

    5.  Receive Salary.

    6.  Upload transaction details.

    7.  Receive complaint:

3.  Employee

    Functions:

    1.  View customer list assigned to Employee.

    2.  Receive Salary.

    3.  Contact Customer.


4.  Designer

    Functions:

    1.  Check customer personalization requirements from Sample or Draft.

    2.  Check pending orders.

    3.  Request

    4.  Submit a design as draft or final.

5.  Customer

    Functions:

    1.  Card type selector and no. of cards ->

        View premade samples (with prices)//not sure yet.

        a.  Select paper type.

        b.  Select color (B&W or Color)

        c.  Select no of cards from range \[10, 100), \[100, 600), \[600, 1500),
            1500+

        d.  An estimated quotation

    2.  Submit as jpg or ID of sample and personalize (submit names and
        suggest changes)

    3.  View Drafts by designer (Finalize/ Suggest)

    4.  Contact nearest branch employee.

    5.  File complaint to supervisor.



















# Updates


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
3. Fill in some user privilege methods. [priority to: adding Employees]

### 2021-08-27 7:12AM Update:
Trying to allow owner to add new employees. Failed. nullPointer exception occurs as it seems currentUser is not inherited by AddEmployee.

Next Plan:
1. fix the problem of adding employees.
2. optimise the methods in DatabaseManipulator class to make them more general and not specific. (reduce lines of repetitive code)
3. Create Alerts for incorrect pass/ existing id etc (Note: adding employees doesnt yet check for previous existence of email in database)

### 2021-08-28 2:40AM Update:
Hiring goals for Owner (supervisor, CService, Designer) method implemented. (not tested yet due to the following problem)
Resolved the issue of adding employees by creating a temporary currentUser binary that any method can access.
a variant of SceneChanger therefore is no longer required for login.
But Image class is not Serializable, so have to find a workaround for that.

Simplified the userdata and credentials retrieval methods.

Next Plan:
1. fix Image not serializable issue.
2. Create Alerts for incorrect pass/ existing id etc (Note: adding employees doesnt yet check for previous existence of email in database)
3. Employee salary management implementation
4. Ability to create orders (Customer).



