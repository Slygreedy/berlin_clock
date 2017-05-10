package BerlinClock;

public class BerlinClockLogic {

    StringBuilding sb = new StringBuilding();

    public String getSeconds(int seconds) {
            if (seconds % 2 == 0) {
                return "0";
            }
        return "Y";
    }

    public String getFiveHours(int hours) {
        return sb.getFourStringDisplay(hours/5);
    }


    public String getHours(int hours) {
        return StringBuilding.getFourStringDisplay(hours%5);
    }

    public String getFiveMinutes(int minutes) {
        return StringBuilding.getElevenStringDisplay(minutes);
    }

    public String getMinutes(int minutes) {
        return StringBuilding.getFourStringDisplay(minutes%5);
    }

}

