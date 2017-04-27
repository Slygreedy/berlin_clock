
import BerlinClock.BerlinClockLogic;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BerlinClockTest {

    BerlinClockLogic bc;

    @Before
    public void initialise () {
        bc = new BerlinClockLogic();
    }


    @Test
    public void second_display_0_for_0_seconds() {
        assertThat(bc.getSeconds(0), is("0"));
    }

    @Test
    public void second_display_Y_for_1_seconds() {
        assertThat(bc.getSeconds(1), is("Y"));
    }

    @Test
    public void minute_display_0_for_0_minutes() {
        assertThat(bc.getMinutes(0), is ("0000"));
    }

    @Test
    public void minute_display_Y_for_1_minutes() {
        assertThat(bc.getMinutes(1), is ("Y000"));
    }

    @Test
    public void minute_display_YY_for_2_minutes() {
        assertThat(bc.getMinutes(2), is ("YY00"));
    }

    @Test
    public void Fiveminute_display_Y_for_5_minutes () {
        assertThat(bc.getFiveMinutes(5), is ("Y0000000000"));
    }

    @Test
    public void Fiveminute_and_minute_display_Y_and_Y_for_6_minutes () {
        assertThat(bc.getMinutes(1), is ("Y000"));
        assertThat(bc.getFiveMinutes(5), is ("Y0000000000"));
    }

    @Test
    public void minute_display_R_for_15_minutes () {
        assertThat(bc.getFiveMinutes(15), is ("YYR00000000"));
    }

    @Test
    public void hour_display_Y_for_1_hour () {
        assertThat(bc.getHours(1), is ("Y000"));
    }

    @Test
    public void Fivehour_display_Y_for_5_hours () {
        assertThat(bc.getFiveHours(5), is ("Y000"));
    }

    @Test
    public void Fivehour_and_hour_displays_Y_and_Y_for_6_hours () {
        assertThat(bc.getHours(1), is ("Y000"));
        assertThat(bc.getFiveHours(5), is ("Y000"));
    }
}
