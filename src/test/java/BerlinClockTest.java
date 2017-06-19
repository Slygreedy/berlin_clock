
import BerlinClock.BerlinClockDisplay;
import BerlinClock.BerlinClockLogic;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BerlinClockTest {

    BerlinClockLogic bc;
    BerlinClockDisplay bd;

    @Before
    public void initialise () {
        bc = new BerlinClockLogic();
        bd = new BerlinClockDisplay();
    }


    @Test
    public void second_should_display_0_for_odd_and_Y_for_even() {
        assertThat(bc.getSeconds(1), is("0"));
        assertThat(bc.getSeconds(10), is("Y"));
    }

    @Test
    public void multiple_hour_should_display_YY00_for_12 () {
        assertThat(bc.getTopHours(12), is("YY00"));
    }

    @Test
    public void single_hour_should_display_YY00_for_12 () {
        assertThat(bc.getBottomHours(12), is("YY00"));
    }

    @Test
    public void multiple_min_should_display_YYYY00000000_for_23 () {
        assertThat(bc.getTopMins(23), is("YYRY0000000"));
    }

    @Test
    public void single_min_should_display_YYYY00000000_for_23 () {
        assertThat(bc.getBottomMins(23), is("YYY0"));
    }
}
