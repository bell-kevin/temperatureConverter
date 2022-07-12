package temperatureconverter;

import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {

    public TemperatureConverterTest() {
    }

    @Test
    public void testFtoC() {
        System.out.println("FtoC");
        assertEquals(0, TemperatureConverter.FtoC(32), 0.00); //F freezing temp
        assertEquals(100, TemperatureConverter.FtoC(212), 0.00); //F boiling temp
        assertEquals(37, TemperatureConverter.FtoC(98.6), 0.00); //F body temp
    } //end testFtoC

    @Test
    public void testCtoF() {
        System.out.println("CtoF");
        assertEquals(32, TemperatureConverter.CtoF(0), 0.00); //C freezing temp
        assertEquals(212, TemperatureConverter.CtoF(100), 0.00); //C boiling temp
        assertEquals(98.6, TemperatureConverter.CtoF(37), 0.00); //C body temp
    } //end testCtoF
} //end class TemperatureConverterTest