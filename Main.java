package com.company;
//Example for creation and execution of Objects and Classes
public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee[] employeeList = new Employee[5];
        employeeList[0] = new Employee(2343, "John", 34,
                56, "Cambridge Street", "Near GH","New York",9009);

        employeeList[1] = new Employee(2344, "Mark", 24,
                56, "Houston Street", "Near Time Square","New York",9089);

        employeeList[2] = new Employee(2345, "Cena", 54,
                56, "Birmingham Street", "Near Townmark","New York",9459);
        for(Employee employee : employeeList) {
            if(employee != null) employee.displayEmployeeDetails();
        }
    }
}

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
