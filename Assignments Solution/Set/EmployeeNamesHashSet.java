package Set;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeNamesHashSet {
    public static void main(String[] args) {
        HashSet<String> employeeNames = new HashSet<>();

        employeeNames.add("Anjali");
        employeeNames.add("Vikram");
        employeeNames.add("Riya");
        employeeNames.add("Mohan");

        System.out.println("Employee Names:");
        Iterator<String> it = employeeNames.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
