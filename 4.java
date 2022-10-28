// Comparable Interface
// Let's get in touch with the comparable interface. Given the list of Address details, sort them based on Pincode. If two addre ss has the same
// Pincode, then sort them based on address line 1. This sorting will help us for segregating users based on Pincode when certain detai ls (City
// and state details) are unavailable.
// Strictly adhere to the Object-Oriented specifications given in the problem statement. All class names, attribute names and method
// names should be the same as specified in the problem statement.
// Create a class Address with the following private attributes
// Attributes Datatype
// username String
// addressLine1 String
// addressLine2 String
// // pinCode Integer
// Include appropriate getters and setters
// Create default constructor and a parameterized constructor with arguments in order
// Address(String username, String addressLine1, String addressLine2, Integer pinCode).
// The Address class implements the comparable interface. Compare pin code, If Pincode is the same then compare with addressLine1.
// Create a driver class named Main to test the above class. Obtain input from the console and sort the user list.

import java.util.*;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of users: ");
        int n = Integer.parseInt(sc.nextLine());
        List<Address> addresses = new ArrayList<>();
        System.out.println("Enter the address details for the users: ");
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(",");
            addresses.add(new Address(input[0], input[1], input[2], Integer.parseInt(input[3])));
        }

        System.out.println("BEFORE SORTING OF ADDRESSES: " + addresses);
        Collections.sort(addresses);
        System.out.println("AFTER SORTING OF ADDRESSES: " + addresses);
        sc.close();
        System.exit(0);
    }
}

class Address implements Comparable<Address> {
    private String username;
    private String addressLine1;
    private String addressLine2;
    private Integer pincode;

    // Constructors
    public Address() {
    }

    public Address(String username, String addressLine1, String addressLine2, Integer pincode) {
        this.username = username;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.pincode = pincode;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    // toString
    @Override
    public String toString() {
        return "Address{" +
                "username='" + username + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    // compareTo
    @Override
    public int compareTo(Address a) {
        Integer ret = this.getPincode() - a.getPincode();
        if (ret == 0) {
            return this.getAddressLine1().compareTo(a.getAddressLine1());
        }
        return ret;
    }
}
