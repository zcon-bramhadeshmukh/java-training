import java.util.ArrayList;
import java.util.Collections;

public class CompareTest {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Bramha", 50000);
        Employee e2 = new Employee(2, "XYZ", 60000);
        Employee e3 = new Employee(3, "PQR", 40000);

        // Create an array of employees
        ArrayList<Employee> l1 = new ArrayList<>();
        l1.add(e1);
        l1.add(e2);
        l1.add(e3);

        System.out.println("Default sorted by ID:");
        System.out.print(l1);

        // Sort the employees by salary using the EmpSalaryComparator
        Collections.sort(l1, new EmpSalaryComparator());

        System.out.print("\n\nSorted by salary:");
        for (Employee e : l1) {
            System.out.print(e);
        }

        //sort emp based on names using lambda expression
        Collections.sort(l1, (emp1, emp2) -> emp1.name.compareTo(emp2.name));
        //string internally implements Comparable interface and compareTo method is overridden to compare 
        //the strings based on their lexicographical order, so we can use it to sort the employees 
        //based on their names as shown in above code

        System.out.print("\n\nSorted by name:");
        // Print the sorted employees
        for (Employee e : l1) {
            System.out.print(e);
        }
    }
}

/*
output:
Default sorted by ID:
[
ID: 1 Name: Bramha Salary: 50000.0, 
ID: 2 Name: XYZ Salary: 60000.0, 
ID: 3 Name: PQR Salary: 40000.0]

Sorted by salary:
ID: 3 Name: PQR Salary: 40000.0
ID: 1 Name: Bramha Salary: 50000.0
ID: 2 Name: XYZ Salary: 60000.0

Sorted by name:
ID: 1 Name: Bramha Salary: 50000.0
ID: 3 Name: PQR Salary: 40000.0
ID: 2 Name: XYZ Salary: 60000.0
 */