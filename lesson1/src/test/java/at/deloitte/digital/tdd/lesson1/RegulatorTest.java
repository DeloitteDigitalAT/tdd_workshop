package at.deloitte.digital.tdd.lesson1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegulatorTest {

    private Regulator regulator;

    @Before
    public void setup() {
        regulator = new Regulator();
    }

    @Test
    public void shouldReturnPlusOne() {

        int temperatureIncement =
                regulator.regulate(25, 20);

        assertEquals(1, temperatureIncement);
    }

    @Test
    public void shouldReturnMinusOne() {

        int temperatureIncement =
                regulator.regulate(20, 25);

        assertEquals(-1, temperatureIncement);
    }

    @Test
    public void shouldReturnZero() {

        int temperatureIncement =
                regulator.regulate(25, 25);

        assertEquals(0, temperatureIncement);
    }
}
