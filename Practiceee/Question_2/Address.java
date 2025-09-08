package Question_2;  // ✅ Ensure package name is correct

public class Address {
    private int streetNumber;
    private String streetName;
    private String city;

    public Address(int streetNumber, String streetName, String city) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }
}
