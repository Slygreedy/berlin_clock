package BerlinClock;

public class StringBuilding {

    public static String getElevenStringDisplay(int minutes) {
    boolean[] array = new boolean[11];
    int bottomHoursOn = minutes / 5;
    StringBuilder sb = new StringBuilder();
    int counter = 1;

    for (int i = 0; i < 11; i++)
        {
            if (i < bottomHoursOn) {
                array[i] = true;
            } else {
                array[i] = false;
            }

            if (array[i] && counter%3==0) {
                sb.append("R");
            } else if (array[i]) {
                sb.append("Y");
            } else {
                sb.append("0");
            }
            counter++;
        }
        return sb.toString();
    }

    public static String getFourStringDisplay(int NumberOfLampsOn) {
    boolean[] array = new boolean[4];
    StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++)
            {
                if (i < NumberOfLampsOn) {
                    array[i] = true;
                    sb.append("Y");
            }   else {
                    array[i] = false;
                    sb.append("0");
                }
            }
        return sb.toString();
    }
}
