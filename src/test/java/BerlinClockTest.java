
import BerlinClock.BerlinClockLogic;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BerlinClockTest {

    @Test
    public void second_display_0_for_0_seconds() {
        assertThat(BerlinClockLogic.getSeconds(0), is("0"));
    }

    @Test
    public void second_display_Y_for_1_seconds() {
        assertThat(BerlinClockLogic.getSeconds(1), is("Y"));
    }

    @Test
    public void minute_display_0_for_0_minutes() {
        assertThat(BerlinClockLogic.getMinutes(0), is ("0000"));
    }

    @Test
    public void minute_display_Y_for_1_minutes() {
        assertThat(BerlinClockLogic.getMinutes(1), is ("Y000"));
    }

    @Test
    public void minute_display_YY_for_2_minutes() {
        assertThat(BerlinClockLogic.getMinutes(2), is ("YY00"));
    }

    @Test
    public void Fiveminute_display_Y_for_5_minutes () {
        assertThat(BerlinClockLogic.getFiveMinutes(5), is ("Y0000000000"));
    }

    @Test
    public void Fiveminute_and_minute_display_Y_and_Y_for_6_minutes () {
        assertThat(BerlinClockLogic.getMinutes(1), is ("Y000"));
        assertThat(BerlinClockLogic.getFiveMinutes(5), is ("Y0000000000"));
    }

    @Test
    public void minute_display_R_for_15_minutes () {
        assertThat(BerlinClockLogic.getFiveMinutes(15), is ("YYR00000000"));
    }

    @Test
    public void hour_display_Y_for_1_hour () {
        assertThat(BerlinClockLogic.getHours(1), is ("Y000"));
    }

    @Test
    public void Fivehour_display_Y_for_5_hours () {
        assertThat(BerlinClockLogic.getFiveHours(5), is ("Y000"));
    }

    @Test
    public void Fivehour_and_hour_displays_Y_and_Y_for_6_hours () {
        assertThat(BerlinClockLogic.getHours(1), is ("Y000"));
        assertThat(BerlinClockLogic.getFiveHours(5), is ("Y000"));
    }
}
