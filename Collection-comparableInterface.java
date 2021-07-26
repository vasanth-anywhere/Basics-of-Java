import java.util.*;
public class Main {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();;
        list.add(new Employee(123,"Rahul"));
        list.add(new Employee(234, "Abin"));
        list.add(new Employee(132, "Yohan"));

        Collections.sort(list);
        for(Employee employee : list) {
            System.out.println(employee);
        }
    }
}
class Employee implements Comparable<Employee>{
    int employeeID;
    String employeeName;
    public Employee(int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }
    public int compareTo(Employee employee) {
        if(this.employeeID == employee.employeeID) return 0;
        else if(this.employeeID > employee.employeeID) return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
