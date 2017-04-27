package BerlinClock;

public class BerlinClockLogic {

    public String getSeconds(int seconds) {
            if (seconds % 2 == 0) {
                return "0";
            }
        return "Y";
    }

    public String getFiveHours(int hours) {
        StringBuilder sb = new StringBuilder();
        return StringBuilding.getFourStringDisplay(hours/5);
    }


    public String getHours(int hours) {
        StringBuilder sb = new StringBuilder();
        return StringBuilding.getFourStringDisplay(hours%5);
    }

    public String getFiveMinutes(int minutes) {
        StringBuilder sb = new StringBuilder();
        return StringBuilding.getElevenStringDisplay(minutes);
    }

    public String getMinutes(int minutes) {
        StringBuilder sb = new StringBuilder();
        return StringBuilding.getFourStringDisplay(minutes%5);
    }

}

