package at.deloitte.digital.tdd.lesson4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RegulatorTest {

    private Regulator regulator;

    @Mock private Thermometer mockThermometer;
    private int currentTemperature;

    @Before
    public void setup() {
        currentTemperature = 20;
        when(mockThermometer.readTemperature()).thenReturn(currentTemperature);
        regulator = new Regulator(mockThermometer);
    }

    @Test
    public void shouldReturnPlusOne() {

        int temperatureIncement =
                regulator.regulate(currentTemperature+5);

        assertEquals(1, temperatureIncement);
    }

    @Test
    public void shouldReturnMinusOne() {

        int temperatureIncement =
                regulator.regulate(currentTemperature-5);

        assertEquals(-1, temperatureIncement);
    }

    @Test
    public void shouldReturnZero() {

        int temperatureIncement =
                regulator.regulate(currentTemperature);

        assertEquals(0, temperatureIncement);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenDesiredTemperatureIsNegative() {
        regulator.regulate(-1);
    }

    @Test
    public void shouldNotThrowIllegalArgumentExceptionWhenCurrentTemperatureIsNegative() {
        try {
            when(mockThermometer.readTemperature()).thenReturn(-1);
            regulator.regulate(new Random().nextInt(20));
        } catch (IllegalArgumentException e) {
            throw new AssertionError(
                    "Should not throw IllegalArgumentException if current temperature is >0");
        }
    }
}
