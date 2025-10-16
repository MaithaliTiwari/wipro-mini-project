package DateTimeAPI;

import java.time.LocalTime;

public class TimeAfterMinutes {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        LocalTime timeAfter25Minutes = currentTime.plusMinutes(25);
        System.out.println("Time after 25 minutes: " + timeAfter25Minutes);
    }
}
