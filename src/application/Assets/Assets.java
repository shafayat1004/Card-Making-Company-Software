package application.Assets;

public abstract class Assets {
    public static String credentialsFilePath = "src/application/Database/Credentials.bin";
    public static String customersFilePath = "src/application/Database/Customers.bin";
    public static String cSEmployeesFilePath = "src/application/Database/EmployeeList/CSEmployees.bin";
    public static String supervisorFilePath = "src/application/Database/EmployeeList/Supervisors.bin";
    public static String designersFilePath = "src/application/Database/EmployeeList/Designers.bin";
    public static String ownersFilePath = "src/application/Database/Owners.bin";
    public static String[] userTypes = {"Customer", "Customer Service Employee", "Supervisor", "Designer", "Owner"};
    public static String[] districts = {"Dhaka", "Chittagong", "Khulna", "Rajshahi", "Sylhet"}; //TODO not all districts added
    public static String addressesFilePath = "src/application/Database/Addresses.bin";
    public static String currentUserFilePath = "src/application/Database/CurrentUser.bin";
    public static String defaultProfilePicture = "src/application/Assets/EmptyPicture.png";
    public static String imageSavePath = "src/application/Database/Images/";
    
    
    // public static String getImageSavePath() {
    //     return imageSavePath;
    // }
    // public static String getDefaultProfilePicture() {
    //     return defaultProfilePicture;
    // }
    // public static String getCurrentUserFilePath() {
    //     return currentUserFilePath;
    // }
    // public static String getCredentialsFilePath() {
    //     return credentialsFilePath;
    // }
    // public static String getAddressesFilePath() {
    //     return addressesFilePath;
    // }
    // public static String getCustomersFilePath() {
    //     return customersFilePath;
    // }
    // public static String getcSEmployeesFilePath() {
    //     return cSEmployeesFilePath;
    // }
    // public static String getSupervisorFilePath() {
    //     return supervisorFilePath;
    // }
    // public static String getDesignersFilePath() {
    //     return designersFilePath;
    // }
    // public static String getOwnersFilePath() {
    //     return ownersFilePath;
    // }
    // public static String[] getDistricts() {
    //     return districts;
    // }
    
}
