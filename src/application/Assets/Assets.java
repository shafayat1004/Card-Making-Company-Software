package application.Assets;

public abstract class Assets {
    private static String credentialsFilePath = "src/application/Database/Credentials.bin";
    private static String customersFilePath = "src/application/Database/Customers.bin";
    private static String cSEmployeesFilePath = "src/application/Database/EmployeeList/CSEmployees.bin";
    private static String supervisorFilePath = "src/application/Database/EmployeeList/Supervisors.bin";
    private static String designersFilePath = "src/application/Database/EmployeeList/Designers.bin";
    private static String ownersFilePath = "src/application/Database/Owners.bin";
    private static String[] userTypes = {"Customer", "Customer Service Employee", "Supervisor", "Designer", "Owner"};
    private static String[] districts = {"Dhaka", "Chittagong", "Khulna", "Rajshahi", "Sylhet"}; //TODO not all districts added
    private static String addressesFilePath = "src/application/Database/Addresses.bin";
    private static String currentUserFilePath = "src/application/Database/CurrentUser.bin";
    private static String defaultProfilePicture = "src/application/Assets/EmptyPicture.png";
    
    
    public static String getDefaultProfilePicture() {
        return defaultProfilePicture;
    }
    public static String getCurrentUserFilePath() {
        return currentUserFilePath;
    }
    public static String getCredentialsFilePath() {
        return credentialsFilePath;
    }
    public static String getAddressesFilePath() {
        return addressesFilePath;
    }
    public static String getCustomersFilePath() {
        return customersFilePath;
    }
    public static String getcSEmployeesFilePath() {
        return cSEmployeesFilePath;
    }
    public static String getSupervisorFilePath() {
        return supervisorFilePath;
    }
    public static String getDesignersFilePath() {
        return designersFilePath;
    }
    public static String getOwnersFilePath() {
        return ownersFilePath;
    }
    public static String[] getUserTypes() {
        return userTypes;
    }
    public static String[] getDistricts() {
        return districts;
    }
    
}
