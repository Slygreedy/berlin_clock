package BerlinClock;

import java.util.HashMap;
import java.util.Map;

public class BerlinClockLogic {


    public String getSeconds(int seconds) {
        if (seconds % 2 == 0) {
            return "0";
        }
        return "Y";
    }

    public String getMinutes(int iminute) {
        return getIndElement(iminute);
    }

    public String getHours(int ihours) {
        return getIndElement(ihours);
    }

    public String getFiveMinutes(int fminutes) {
        int fminute = fminutes / 5;

        Map<Integer, String> map = getElevenStringMap();

        return map.get(fminute);
    }

    private String getIndElement(int indMinOrHours) {
        int indMinOrHour = indMinOrHours % 5;

        Map<Integer, String> map = getFourStringMap();

        return map.get(indMinOrHour);
    }

    public String getFiveHours(int fiveHours) {
        int fiveHour = fiveHours / 5;

        Map<Integer, String> map = getFourStringMap();

        return map.get(fiveHour);

    }

    private Map<Integer, String> getFourStringMap() {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "0000");
        map.put(1, "Y000");
        map.put(2, "YY00");
        map.put(3, "YYY0");
        map.put(4, "YYYY");
        return map;
    }

    private Map<Integer, String> getElevenStringMap() {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "00000000000");
        map.put(1, "Y0000000000");
        map.put(2, "YY000000000");
        map.put(3, "YYR00000000");
        map.put(4, "YYRY0000000");
        map.put(5, "YYRYY000000");
        map.put(6, "YYRYYR00000");
        map.put(7, "YYRYYRY0000");
        map.put(8, "YYRYYRYY000");
        map.put(9, "YYRYYRYYR00");
        map.put(10, "YYRYYRYYRY0");
        map.put(11, "YYRYYRYYRYY");
        return map;
    }
}

