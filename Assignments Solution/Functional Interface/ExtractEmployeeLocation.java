package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExtractEmployeeLocation {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Amit", "Pune", 8000));
        employees.add(new Employee(102, "Priya", "Mumbai", 12000));
        employees.add(new Employee(103, "Rahul", "Pune", 20000));
        employees.add(new Employee(104, "Sneha", "Bengaluru", 9500));
        employees.add(new Employee(105, "Vikram", "Mumbai", 15000));

        // Function to extract location from an Employee object
        Function<Employee, String> extractLocation = Employee::getLocation;

        List<String> locations = employees.stream()
                                          .map(extractLocation)
                                          .collect(Collectors.toList());

        System.out.println("Employee Locations: " + locations);
    }
}
