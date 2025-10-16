package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployees {
    public static void main(String[] args) {
        // 1. To add five Employee objects into an ArrayList
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Amit Kumar", 30, "Pune"));
        employees.add(new Employee(102, "Priya Sharma", 25, "Mumbai"));
        employees.add(new Employee(103, "Rahul Verma", 35, "Pune"));
        employees.add(new Employee(104, "Sneha Reddy", 28, "Bengaluru"));
        employees.add(new Employee(105, "Vikram Singh", 40, "Pune"));

        // 2. Filter the Employee objects whose location is Pune
        // 3. Store them in a separate ArrayList and print their details.
        List<Employee> puneEmployees = employees.stream()
                .filter(emp -> emp.getLocation().equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees from Pune:");
        puneEmployees.forEach(System.out::println);
    }
}
