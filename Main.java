package com.company;

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
