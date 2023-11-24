package ClassPractice.Week12.week12_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "IT", 70000));
        employees.add(new Employee(2, "Martin Smith", "HR", 54000));
        employees.add(new Employee(2, "Sara Parker", "Sales", 68000));
        employees.add(new Employee(2, "Tom Joe", "HR", 60000));

        // Define lambda expression to check if salary is above a threshold
        EmployeeChecker salaryCheck = e -> e.getSalary() > 65000;

        //EXAMPLE 1: Filtering and printing employees with salary above a certain threshold.
        System.out.println("Employees with salary above 65000: ");
        employees.stream().filter(salaryCheck::check).forEach(System.out::println);

        //EXAMPLE 2: Increasing salary by 10% for all employees
        System.out.println("\nEmployees with increased salary:");
        employees.stream()
                //peek() is used to perform an action on each element of the stream
                .peek(e -> e.setSalary(e.getSalary() * 1.10))
                .forEach(System.out::println);

        //EXAMPLE 3: Sorting employees by name
        List<Employee> sortedByName = employees.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                        .collect(Collectors.toList());

        System.out.println("\nEmployees sorted by name:");
        sortedByName.forEach(System.out::println);

        //EXAMPLE 4: Counting number of employees in 'IT' department
        long countIT = employees.stream()
                .filter(e -> "IT".equals(e.getDepartment())).count();

        System.out.println("\nNumber of employees in IT: " + countIT);

    }
}
