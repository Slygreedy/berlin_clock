package BerlinClock;

import org.joda.time.DateTime;

public class BerlinClockDisplay {

    public static void main(String[] args) {
        BerlinClockLogic bc = new BerlinClockLogic();
        DateTime dt = new DateTime();

        int hours = dt.getHourOfDay();
        int minutes = dt.getMinuteOfHour();
        int seconds = dt.getSecondOfMinute();

        System.out.println(bc.getSeconds(seconds));
        System.out.println(bc.getFiveHours(hours));
        System.out.println(bc.getHours(hours));
        System.out.println(bc.getFiveMinutes(minutes));
        System.out.println(bc.getMinutes(minutes));
    }
}
