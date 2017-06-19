package BerlinClock;

import java.util.List;
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

    // 2. moved this out of logic class and made public but now it does not work?
    public String format(List<String> numbers) {
    return numbers.toString()
        .replace(",", "")  //remove the commas
        .replace("[", "")  //remove the right bracket
        .replace("]", "")  //remove the left bracket
        .replace(" ", "")
        .trim();
    }
}
