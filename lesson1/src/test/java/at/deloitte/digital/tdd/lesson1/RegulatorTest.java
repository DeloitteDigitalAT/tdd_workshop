package at.deloitte.digital.tdd.lesson1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegulatorTest {

    private int currentTemperature;
    private Regulator regulator;

    @Before
    public void setup() {
        regulator = new Regulator();
        currentTemperature = 20;
    }

    @After
    public void tearDown() {
        regulator = null;
    }

    @Test
    public void shouldReturnPlusOne() {

        int temperatureIncement =
                regulator.regulate(currentTemperature+1, currentTemperature);

        assertEquals(1, temperatureIncement);
    }

    @Test
    public void shouldReturnMinusOne() {

        int temperatureIncement =
                regulator.regulate(currentTemperature-1, currentTemperature);

        assertEquals(-1, temperatureIncement);
    }

    @Test
    public void shouldReturnZero() {

        int temperatureIncement =
                regulator.regulate(currentTemperature, currentTemperature);

        assertEquals(0, temperatureIncement);
    }
}
