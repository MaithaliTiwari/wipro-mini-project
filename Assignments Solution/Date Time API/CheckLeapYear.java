package DateTimeAPI;

import java.time.Year;

public class CheckLeapYear {
    public static void main(String[] args) {
        Year currentYear = Year.now();

        if (currentYear.isLeap()) {
            System.out.println("The current year (" + currentYear + ") is a leap year.");
        } else {
            System.out.println("The current year (" + currentYear + ") is not a leap year.");
        }
    }
}
