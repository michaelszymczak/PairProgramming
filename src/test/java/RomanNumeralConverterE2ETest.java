import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RomanNumeralConverterE2ETest {

    RomanNumeralConverter converter;
    RomanNumeralConverterService service;

    @Before
    public void setUp() throws Exception {
        service = new RomanNumeralServiceImpl();
        converter = new RomanNumeralConverter(service);
    }

    @Test
    public void shouldConvertToRoman() throws Exception {
        assertEquals("I", converter.convert(1));
        assertEquals("II", converter.convert(2));
        assertEquals("III", converter.convert(3));
        assertEquals("V", converter.convert(5));
        assertEquals("M", converter.convert(1000));
    }

    @Test
    public void shouldAddRomanNumeralsToRepresentNumbers() throws Exception {
        assertEquals("VI", converter.convert(6));
        assertEquals("XVI", converter.convert(16));
        assertEquals("XXI", converter.convert(21));
    }


}
