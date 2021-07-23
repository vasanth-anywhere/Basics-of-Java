package com.company;
import java.util.*;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmployeeDetails ob = new EmployeeDetails();
        ob.index();
        System.out.println(ob.employees);
        System.out.println(ob.ids);
        System.out.println(ob.phoneNumbers);
    }
}

public class EmployeeDetails {
    Scanner scan = new Scanner(System.in);

    Set<Integer> ids = new HashSet<>();
    Set<String> phoneNumbers = new HashSet<>();
    HashMap<String, Employee> employees = new HashMap<>();

    public void index() {

        System.out.println("***********************************");
        System.out.println("Welcome to ABC International Company!");
        System.out.println("***********************************");
        System.out.println();
        System.out.println("1. REGISTER 2.LOGIN 3.EXIT, ENTER A NUMBER:");
        int ch = scan.nextInt();
        switch(ch) {
            case 1:
                register();
                break;
            case 2:
                login();
                break;
            default:
                exit();
        }
    }

    public void register() {

        System.out.println("Enter Employee ID");
        int employeeID = scan.nextInt();

        System.out.println("Enter Employee Name");
        scan.nextLine();
        String employeeName = scan.nextLine();

        System.out.println("Enter Email");
        String email = scan.nextLine();

        System.out.println("Enter Password");
        String password = scan.nextLine();

        System.out.println("Enter your Contact number");
        String phoneNumber = scan.nextLine();

        if(!isValidEmailAddress(email)) {
            System.out.println("Use a valid email address.");
            index();
        }
        if(!employees.containsKey(email) && !ids.contains(employeeID) &&
                !phoneNumbers.contains(phoneNumber)) {
            Employee employee = new Employee(employeeID,employeeName,email,password,phoneNumber);
            employees.put(email, employee);
            ids.add(employeeID);
            phoneNumbers.add(phoneNumber);
            System.out.println("You are successfully registered.");
        }
        else {
            System.out.println("Your details already exist. Kindly use new Email, EmployeeID and Contact number.");
        }
        index();
    }

    public void login() {

        String email;
        System.out.println("Enter email:");
        scan.nextLine();
        email = scan.nextLine();

        String password;
        System.out.println("Enter password:");
        password = scan.nextLine();
        System.out.println(email+" "+password);

        if ( employees.containsKey(email) && (employees.get(email).password.equals(password))) {
            Employee employee = employees.get(email);
            System.out.println("Welcome Mr." + employee.employeeName + "!, Have a good day.");
        }
        else {
            System.out.println("Password or email is wrong. Kindly enter the right email and password.");
        }
        index();
    }

    private boolean isValidEmailAddress(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +  //part before @
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pattern.matcher(email).matches();
    }

    public void exit() {
        System.out.println("Thank you for using the services. Hope you come back!");
    }

}

public class Employee {
    int employeeID;
    String employeeName;
    String email;
    String password;
    String phoneNumber;
    public Employee(int employeeID, String employeeName, String email, String password, String phoneNumber) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
