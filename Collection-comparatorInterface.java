import java.util.*;
public class Main {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();;
        list.add(new Employee(123,"Rahul"));
        list.add(new Employee(234, "Abin"));
        list.add(new Employee(132, "Yohan"));

        System.out.println("Original List");
        for(Employee employee : list) {
            System.out.println(employee);
        }

        System.out.println("Sorting by Name");
        Collections.sort(list, new NameComparator());
        for(Employee employee : list) {
            System.out.println(employee);
        }

        System.out.println("Sorting by Employee ID");
        Collections.sort(list, new EmployeeComparator());
        for(Employee employee : list) {
            System.out.println(employee);
        }
    }
}
public class NameComparator implements Comparator {
    public int compare(Object object1, Object object2) {
        Employee employee1 = (Employee) object1;
        Employee employee2 = (Employee) object2;
        return employee1.employeeName.compareTo(employee2.employeeName);
    }
}
public class EmployeeComparator implements Comparator {
    public int compare(Object object1, Object object2) {
        Employee employee1 = (Employee) object1;
        Employee employee2 = (Employee) object2;

        if(employee1.employeeID == employee2.employeeID) return 0;
        else if(employee1.employeeID > employee2.employeeID) return 1;
        else return -1;
    }
}
class Employee{
    int employeeID;
    String employeeName;
    public Employee(int employeeID, String employeeName){//, String email, String password, String phoneNumber) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }
    @Override
    public String toString() {
        return "employeeID=" + employeeID +
                ", employeeName='" + employeeName;
    }
}
