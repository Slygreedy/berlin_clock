package BerlinClock;

public class BerlinClockLogic {


    public static String getSeconds(int seconds) {
        if (seconds % 2 == 0) {
            return "0";
        }
        return "Y";
    }

    public static String getMinutes(int iminute) {
        return getIndElement(iminute);
    }

    public static String getHours(int ihours) {
        return getIndElement(ihours);
    }

    public static String getFiveMinutes(int fminute) {
        if (fminute / 5 == 1) {
            return "Y0000000000";
        }
        if (fminute / 5 == 2) {
            return "YY000000000";
        }
        if (fminute / 5 == 3) {
            return "YYR00000000";
        }
        if (fminute / 5 == 4) {
            return "YYRY0000000";
        }
        if (fminute / 5 == 5) {
            return "YYRYY000000";
        }
        if (fminute / 5 == 6) {
            return "YYRYYR00000";
        }
        if (fminute / 5 == 7) {
            return "YYRYYRY0000";
        }
        if (fminute / 5 == 8) {
            return "YYRYYRYY000";
        }
        if (fminute / 5 == 9) {
            return "YYRYYRYYR00";
        }
        if (fminute / 5 == 10) {
            return "YYRYYRYYRY0";
        }
        if (fminute / 5 == 11) {
            return "YYRYYRYYRYY";
        }
        else {
            return "00000000000";
        }

    }

    private static String getIndElement(int indElement) {
        if (indElement % 5 == 0) {
            return "0000";
        } else if (indElement % 5 == 1) {
            return "Y000";
        } else if (indElement % 5 == 2) {
            return "YY00";
        } else if (indElement % 5 == 3) {
            return "YYY0";
        } else {
            return "YYYY";
        }
    }

    public static String getFiveHours(int fiveHours) {
        if (fiveHours /5 == 0) {
            return "0000";
        } else if (fiveHours / 5 == 1) {
            return "Y000";
        } else if (fiveHours / 5 == 2) {
            return "YY00";
        } else if (fiveHours / 5 == 3) {
            return "YYY0";
        } else  {
            return "YYYY";
        }
    }
}

