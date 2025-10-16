package DateTimeAPI;

import java.time.LocalTime;

public class TimeBeforeHours {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        LocalTime pastTime = currentTime.minusHours(5).minusMinutes(30);
        System.out.println("Time 5 hours and 30 minutes before: " + pastTime);
    }
}
