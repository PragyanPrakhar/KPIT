package Question_2;  // ✅ Ensure package name is correct

import Question_2.Address;  // ✅ Import Address explicitly

public class Person {
    private String personName;
    private int personAge;
    private String personGender;
    private long personPhonenumber;
    private Address address;  // ✅ Address should now be recognized

    public Person(String personName, int personAge, String personGender, long personPhonenumber, Address address) {
        this.personName = personName;
        this.personAge = personAge;
        this.personGender = personGender;
        this.personPhonenumber = personPhonenumber;
        this.address = address;
    }

    public String getPersonName() {
        return personName;
    }
    
    public int getPersonAge() {
        return personAge;
    }
    public void displayDetails() {
        System.out.println("Person Name: " + personName);
        System.out.println("Person Age: " + personAge);
        System.out.println("Address is: " + address.getStreetNumber() + " " + address.getStreetName() + ", " + address.getCity());
    }
}
