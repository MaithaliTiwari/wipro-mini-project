package List;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        Iterator<Employee> it = list.iterator();
        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getEmpId() == empId) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (Employee emp : list) {
            if (emp.getEmpId() == empId) {
                return "Payslip for " + emp.empName + ": " + emp.getSalary();
            }
        }
        return "Employee not found.";
    }

    public void listAll() {
        for (Employee emp : list) {
            emp.GetEmployeeDetails();
            System.out.println("--------------------");
        }
    }
}
