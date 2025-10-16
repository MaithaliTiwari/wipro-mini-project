package DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class CalculateExperience {
    public static void main(String[] args) {
        // Assume a start date for experience calculation
        LocalDate startDate = LocalDate.of(2021, 5, 20);
        LocalDate today = LocalDate.now();

        System.out.println("Joining Date: " + startDate);
        System.out.println("Today's Date: " + today);

        Period experience = Period.between(startDate, today);

        System.out.printf("Total Experience: %d years, %d months, and %d days.%n",
                experience.getYears(),
                experience.getMonths(),
                experience.getDays());
    }
}
