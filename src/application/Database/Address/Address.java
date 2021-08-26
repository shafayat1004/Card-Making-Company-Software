package application.Database.Address;

public class Address {
    
    private String userID;
    private String floorNo, houseDetails, streetDetails, blockAndArea, district, upazillaOrCCorp, division;

    public Address(String userID, String floorNo, String houseDetails, String streetDetails, String blockAndArea,
            String district, String upazillaOrCCorp, String division) {
        this.userID = userID;
        this.floorNo = floorNo;
        this.houseDetails = houseDetails;
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
    public String getFloorNo() {
        return floorNo;
    }
    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }
    public String getHouseDetails() {
        return houseDetails;
    }
    public void setHouseDetails(String houseDetails) {
        this.houseDetails = houseDetails;
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
