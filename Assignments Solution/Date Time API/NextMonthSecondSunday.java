package DateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NextMonthSecondSunday {
    public static void main(String[] args) {
        // Get the first day of the next month
        LocalDate firstDayOfNextMonth = LocalDate.now().plusMonths(1).withDayOfMonth(1);

        // Find the first Sunday of the next month
        LocalDate firstSunday = firstDayOfNextMonth.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));

        // Find the second Sunday by adding one week to the first Sunday
        LocalDate secondSunday = firstSunday.plusWeeks(1);

        System.out.println("The date of next month's second Sunday is: " + secondSunday);
    }
}
