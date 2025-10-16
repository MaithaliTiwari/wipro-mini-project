package com.employee;

import java.util.*;

public class EmployeeManagement {

    private static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Sort by Salary");
            System.out.println("5. Remove Employee by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addEmployee(sc);
                case 2 -> displayEmployees();
                case 3 -> searchEmployee(sc);
                case 4 -> sortBySalary();
                case 5 -> removeEmployee(sc);
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);

        sc.close();
    }

    private static void addEmployee(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employeeList.add(new Employee(id, name, salary));
        System.out.println("✅ Employee added successfully!");
    }

    private static void displayEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("⚠️ No employees found!");
            return;
        }
        System.out.println("\n--- Employee List ---");
        employeeList.forEach(System.out::println);
    }

    private static void searchEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        for (Employee e : employeeList) {
            if (e.getId() == id) {
                System.out.println("🔍 Found: " + e);
                return;
            }
        }
        System.out.println("❌ Employee not found!");
    }

    private static void sortBySalary() {
        if (employeeList.isEmpty()) {
            System.out.println("⚠️ No employees to sort!");
            return;
        }
        employeeList.sort(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("📊 Sorted by Salary:");
        employeeList.forEach(System.out::println);
    }

    private static void removeEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to remove: ");
        int id = sc.nextInt();

        boolean removed = employeeList.removeIf(e -> e.getId() == id);
        if (removed) {
            System.out.println("🗑️ Employee removed successfully!");
        } else {
            System.out.println("❌ Employee not found!");
        }
    }
}
