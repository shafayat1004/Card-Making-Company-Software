package application.Address;

public class Address {
    String houseName, streetName, block, area, thana, zipcode, city, district, upazila, division;


    @Override
    public String toString() {
        return "Address [houseName=" + houseName + ", streetName=" + streetName + ", block=" + block + ", area=" + area + ", thana="
                + thana + ", upazila=" + upazila + ", zipcode=" + zipcode + ", city=" + city + ", district=" + district+ ", division=" + division
                + "]";
    }

    public Address(String houseName, String streetName, String block, String area, String thana, String zipcode,
            String city, String district, String upazila, String division) {
        this.houseName = houseName;
        this.streetName = streetName;
        this.block = block;
        this.area = area;
        this.thana = thana;
        this.zipcode = zipcode;
        this.city = city;
        this.district = district;
        this.upazila = upazila;
        this.division = division;
    }
    
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getUpazila() {
        return upazila;
    }

    public void setUpazila(String upazila) {
        this.upazila = upazila;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getThana() {
        return thana;
    }

    public void setThana(String thana) {
        this.thana = thana;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
    
}
