package FunctionalInterface;

public class Employee {
    int id;
    String name;
    String location;
    double salary; // Added for assignment 4

    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", location='" + location + '\'' + ", salary=" + salary + '}';
    }
}
