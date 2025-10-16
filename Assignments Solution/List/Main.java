package List;

public class Main {
    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();

        Employee emp1 = new Employee(101, "Aarav Sharma", "aarav@example.com", "Male", 50000.0f);
        Employee emp2 = new Employee(102, "Priya Patel", "priya@example.com", "Female", 65000.0f);
        Employee emp3 = new Employee(103, "Rohan Gupta", "rohan@example.com", "Male", 55000.0f);

        db.addEmployee(emp1);
        db.addEmployee(emp2);
        db.addEmployee(emp3);

        System.out.println("All employees after adding:");
        System.out.println("===========================");
        db.listAll();

        System.out.println("\nShowing Payslip for Employee 102:");
        System.out.println(db.showPaySlip(102));

        System.out.println("\nDeleting Employee with ID 103...");
        boolean isDeleted = db.deleteEmployee(103);
        System.out.println("Deletion status: " + isDeleted);


        System.out.println("\nAll employees after deletion:");
        System.out.println("===========================");
        db.listAll();
        
        System.out.println("\nTrying to get payslip for deleted employee 103:");
        System.out.println(db.showPaySlip(103));
    }
}
