package BerlinClock;

import org.joda.time.DateTime;

public class BerlinClockDisplay {
    public static void main(String[] args) {

        BerlinClockLogic bl = new BerlinClockLogic();
        DateTime dt = new DateTime();

        int hours = dt.getHourOfDay();
        int mins = dt.getMinuteOfHour();
        int seconds = dt.getSecondOfDay();

        System.out.println(bl.getSeconds(seconds));
        System.out.println(bl.getTopHours(hours));
        System.out.println(bl.getBottomHours(hours));
        System.out.println(bl.getTopMins(mins));
        System.out.println(bl.getBottomMins(mins));
    }
}
