package BerlinClock;

import java.util.ArrayList;
import java.util.List;

public class BerlinClockLogic {

    private static final int FOURLIGHTS = 4;
    private static final int DIVISOR = 5;

    public String getSeconds(int seconds) {
        if (seconds % 2 == 0) {
            return "Y";
        }
        return "0";
    }

    public String getTopHours(int hours) {
        int lampNumberOn = hours / DIVISOR;
        List<String> numbers = buildClockString(lampNumberOn);
        //StringBuilder sb = buildClockString(lampNumberOn);
        return format(numbers);
    }




    public String getBottomHours(int hours) {
        int lampNumberOn = hours % DIVISOR;
        List<String> numbers = buildClockString(lampNumberOn);
        //StringBuilder sb = buildClockString(lampNumberOn);
        return format (numbers);
    }

    public String getTopMins(int minutes) {
        int lampNumberOn = minutes / DIVISOR;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            if (lampNumberOn <= i) {
                sb.append("0");

            } else if (lampNumberOn > i && (i+1) % 3 == 0) {
                sb.append("R");
            } else {
                sb.append("Y");
            }
        }
        return sb.toString();
    }

    public String getBottomMins(int minutes) {
        int lampNumberOn = minutes % DIVISOR;
        List<String> numbers = buildClockString(lampNumberOn);
        //StringBuilder sb = buildClockString(lampNumberOn);
        return format (numbers);
    }


    private List<String> buildClockString(int lampNumberOn) {
        List<String> numbers = new ArrayList<String>();
        //StringBuilder sb = new StringBuilder();
        for (int i = 0; i < FOURLIGHTS; i++) {
            if (lampNumberOn <= i) {
                numbers.add("0");
            } else {
                numbers.add("Y");
            }
        }
        return numbers;
    }

    private String format(List<String> numbers) {
        return numbers.toString()
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .replace(" ", "")
                .trim();
    }
}



