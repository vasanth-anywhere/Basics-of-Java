package com.company;

public class Employee {
    public int employeeID;
    private String employeeName;
    private int age;
    private Address address;
    public Employee(int employeeID, String employeeName, int age, int doorNumber,
    String streetName, String landmark, String city, int pincode) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.age = age;
        this.address = new Address(doorNumber, streetName, landmark, city, pincode);
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee Details : ");
        System.out.println("Employee ID : "+employeeID);
        System.out.println("Employee Name : "+employeeName);
        System.out.println("Employee Age : "+age);
        System.out.println("Employee address : "+this.address.display());
        System.out.println();

    }
}
