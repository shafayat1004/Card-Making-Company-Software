package application.Assets;

public abstract class Assets {
    public static String[] userTypes = {"Customer", "Customer Service Employee", "Supervisor", "Designer", "Owner"};
    public static String[] districts = {"Dhaka", "Chittagong", "Khulna", "Rajshahi", "Sylhet"}; //TODO not all districts added
    public static String[] cardTypes = {"Wedding Card", "Birthday Card", "Calendar", "Seasons Greetings", "Diary"};
    public static String[] paperTypes = {"Cotton Cardstock", "Linen Cardstock", "Canvas Cardstock", "Parchment.", "Kraft", "Vellum"};
    public static String[] colorOptions = {"Black And White", "Standard Color", "Highest Quality Color"};
    public static String[] imgExtensions = {"*.png", "*.PNG", "*.jpg", "*.JPG", "*.jpeg"};
    public static String[] orderStatus = {"Pending Approval", "Employees Assigned", "Awaiting Customer Approval", "Making Cards", "Delivering to Branch", "Awaiting Customer Pickup", "Completed", "Rejected"};

    /*
        For Linux/Mac Systems
    */
    public static String credentialsFilePath = "src/application/Database/Credentials.bin";
    public static String customersFilePath = "src/application/Database/Customers.bin";
    public static String cSEmployeesFilePath = "src/application/Database/EmployeeList/CSEmployees.bin";
    public static String supervisorFilePath = "src/application/Database/EmployeeList/Supervisors.bin";
    public static String designersFilePath = "src/application/Database/EmployeeList/Designers.bin";
    public static String ownersFilePath = "src/application/Database/Owners.bin";
    public static String addressesFilePath = "src/application/Database/Addresses.bin";
    public static String currentUserFilePath = "src/application/Database/CurrentUser.bin";
    public static String defaultProfilePicture = "src/application/Assets/EmptyPicture.png";
    public static String imageSavePath = "src/application/Database/Images/";
    public static String branchesFilePath = "src/application/Database/Branches.bin";
    public static String ordersFilePath = "src/application/Database/Orders.bin";
    public static String customCardDir = "src/application/Database/CustomCards/";
    public static String sampleSaveDir = "src/application/Database/SampleCards/";

    /*
        For Windows Systems
    */
    // public static String credentialsFilePath = "src\\application\\Database\\Credentials.bin";
    // public static String customersFilePath = "src\\application\\Database\\Customers.bin";
    // public static String cSEmployeesFilePath = "src\\application\\Database\\EmployeeList\\CSEmployees.bin";
    // public static String supervisorFilePath = "src\\application\\Database\\EmployeeList\\Supervisors.bin";
    // public static String designersFilePath = "src\\application\\Database\\EmployeeList\\Designers.bin";
    // public static String ownersFilePath = "src\\application\\Database\\Owners.bin";
    // public static String addressesFilePath = "src\\application\\Database\\Addresses.bin";
    // public static String currentUserFilePath = "src\\application\\Database\\CurrentUser.bin";
    // public static String defaultProfilePicture = "src\\application\\Assets\\EmptyPicture.png";
    // public static String imageSavePath = "src\\application\\Database\\Images\\";
    // public static String branchesFilePath = "src\\application\\Database\\Branches.bin";
    // public static String ordersFilePath = "src\\application\\Database\\Orders.bin";
    // public static String customCardDir = "src\\application\\Database\\CustomCards\\";
    // public static String sampleSaveDir = "src\\application\\Database\\SampleCards\\";
    
}
