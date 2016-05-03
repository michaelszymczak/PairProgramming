import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

        Assert.assertEquals("I", converter.convert(1));
        Assert.assertEquals("II", converter.convert(2));
    }

    @Test
    public void shouldAddRomanNumeralsToRepresentNumbers() throws Exception {
        Assert.assertEquals("VI", converter.convert(6));
    }


}
