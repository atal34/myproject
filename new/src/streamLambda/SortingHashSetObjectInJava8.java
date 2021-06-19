package streamLambda;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class SortingHashSetObjectInJava8 {
	 
    public static void main(String[] args) {
 
        // creating HashSet object of type String
        Set<Employee> hSetEmployees = 
                new HashSet<Employee>();
 
        // creating Employee objects
        Employee employee2 = new Employee(
                "Bill G", 1001, 36, "Consultant");
        Employee employee1 = new Employee(
                "Mark Z", 1002, 30, "Engineer");
        Employee employee4 = new Employee(
                "Sundar P", 1003, 32, "Architect");
        Employee employee3 = new Employee(
                "Larry P", 1004, 25, "Designer");
 
 
        // adding Employee to HashSet object
        hSetEmployees.add(employee1);
        hSetEmployees.add(employee2);
        hSetEmployees.add(employee3);
        hSetEmployees.add(employee4);
 
        // Iterating using enhanced for-loop
        System.out.println("Random-order: "
                + "Iterating Employee\n");
        hSetEmployees.forEach(
                employee -> System.out.println(employee));
 
        // sorting using Java 1.8 stream
        List<Employee> lstOfEmployee = hSetEmployees.stream()
                .sorted(Comparator.comparing(
                        Employee::getEmpName)) //comparator
                        .collect(Collectors.toList()); //collector
 
        // Iterating using enhanced for-loop
        System.out.println("\n\nAscending Sorting-order: "
                + "Iterating Employee\n");
        lstOfEmployee.forEach(
                employee -> System.out.println(employee));
    }
}
