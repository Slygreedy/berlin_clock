package BerlinClock;

import java.util.ArrayList;
import java.util.List;

//I don't think this is the answer - otherwsie format error
import static com.sun.tools.javac.util.Constants.format;

public class BerlinClockLogic {

    //this is where I refer to a field several times and only want to specify it once
    //BUT why private (only used within this class), static (can invoke method
    //without instantiating an object first) and final just means it cannot be changed
    private static final int FOURLIGHTS = 4;
    private static final int DIVISOR = 5;

    private static BerlinClockDisplay bd = new BerlinClockDisplay();

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
        return bd.format(numbers);
    }

    // 4. StringBuilder vs Array
    public String getBottomHours(int hours) {
        int lampNumberOn = hours % DIVISOR;
        List<String> numbers = buildClockString(lampNumberOn);
        //StringBuilder sb = buildClockString(lampNumberOn);
        return bd.format(numbers);
    }

    public String getTopMins(int minutes) {
        int lampNumberOn = minutes / DIVISOR;
        // 1. if I convert this to an array as per other methods it fails (adds four Y's at the beginning) - why???
        List<String> numbers = buildClockString(lampNumberOn);
        //StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            if (lampNumberOn <= i) {
                numbers.add("0");

            } else if (lampNumberOn > i && (i+1) % 3 == 0) {
                numbers.add("R");
            } else {
                numbers.add("Y");
            }
        }
        return bd.format(numbers);
    }

    public String getBottomMins(int minutes) {
        int lampNumberOn = minutes % DIVISOR;
        List<String> numbers = buildClockString(lampNumberOn);
        //StringBuilder sb = buildClockString(lampNumberOn);
        return bd.format(numbers);
    }


    // 3. why do I not need to format this numbers
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

}



