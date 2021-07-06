package com.company;

public class Address {
    private int doorNumber;
    private String streetName;
    private String landmark;
    private String city;
    private int pincode;
    public Address(int doorNumber, String streetName, String landmark, String city, int pincode) {
        this.doorNumber = doorNumber;
        this.city = city;
        this.landmark = landmark;
        this.pincode = pincode;
        this.streetName = streetName;
    }
    public String display() {
        return (doorNumber+", "+streetName+", "+landmark+", "+city+", "+pincode);
    }
}
