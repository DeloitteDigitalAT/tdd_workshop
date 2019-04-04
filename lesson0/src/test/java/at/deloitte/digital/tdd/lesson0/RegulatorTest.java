package at.deloitte.digital.tdd.lesson0;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RegulatorTest {

    private Regulator regulator;

    @Before
    public void setup() {
        regulator = new Regulator();
    }

    @After
    public void tearDown() {
        regulator = null;
    }

    @Test
    public void shouldRegulate() {

        final int currentTemperature = 20;

        regulator.regulate(10, currentTemperature);

        assertTrue(true);
    }
}
