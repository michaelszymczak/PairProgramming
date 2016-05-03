import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void shouldSubtractROmanNumeralsIfLargerOneIsAfterSmallerOne() throws Exception {
        assertEquals("IV", converter.convert(4));
        assertEquals("IX", converter.convert(9));
        assertEquals("XL", converter.convert(40));
        assertEquals("XC", converter.convert(90));
        assertEquals("CD", converter.convert(400));
        assertEquals("CM", converter.convert(900));
    }
}
