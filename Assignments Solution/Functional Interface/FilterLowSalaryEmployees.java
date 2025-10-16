package FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FilterLowSalaryEmployees {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Amit", "Pune", 8000));
        employees.add(new Employee(102, "Priya", "Mumbai", 12000));
        employees.add(new Employee(103, "Rahul", "Pune", 20000));
        employees.add(new Employee(104, "Sneha", "Bengaluru", 9500));
        employees.add(new Employee(105, "Vikram", "Mumbai", 15000));

        // Predicate to filter employees with salary less than 10000
        Predicate<Employee> lowSalary = emp -> emp.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");
        employees.stream()
                 .filter(lowSalary)
                 .forEach(emp -> System.out.println(emp.getName()));
    }
}
