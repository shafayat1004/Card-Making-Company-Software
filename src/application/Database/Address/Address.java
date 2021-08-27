package application.Database.Address;

public class Address {
    
    private String userID;
    private String floorAndHouseDetails, streetDetails, blockAndArea, district, upazillaOrCCorp, division;

    public Address(String userID, String floorAndHouseDetails, String streetDetails, String blockAndArea,
            String district, String upazillaOrCCorp, String division) {
        this.userID = userID;
        this.floorAndHouseDetails = floorAndHouseDetails;
        this.streetDetails = streetDetails;
        this.blockAndArea = blockAndArea;
        this.district = district;
        this.upazillaOrCCorp = upazillaOrCCorp;
        this.division = division;
    }

    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public String getFloorAndHouseDetails() {
        return floorAndHouseDetails;
    }
    public void setFloorAndHouseDetails(String floorAndHouseDetails) {
        this.floorAndHouseDetails = floorAndHouseDetails;
    }
    public String getStreetDetails() {
        return streetDetails;
    }
    public void setStreetDetails(String streetDetails) {
        this.streetDetails = streetDetails;
    }
    public String getBlockAndArea() {
        return blockAndArea;
    }
    public void setBlockAndArea(String blockAndArea) {
        this.blockAndArea = blockAndArea;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getUpazillaOrCCorp() {
        return upazillaOrCCorp;
    }
    public void setUpazillaOrCCorp(String upazillaOrCCorp) {
        this.upazillaOrCCorp = upazillaOrCCorp;
    }
    public String getDivision() {
        return division;
    }
    public void setDivision(String division) {
        this.division = division;
    }

}
