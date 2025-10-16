package DateTimeAPI;

import java.time.LocalDate;

public class DateAfterTenDays {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // Calculate the date after ten days
        LocalDate dateAfterTenDays = today.plusDays(10);
        System.out.println("Date after ten days: " + dateAfterTenDays);
    }
}
