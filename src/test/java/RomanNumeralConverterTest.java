import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralConverterTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void shouldConvertToRoman() throws Exception {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        Assert.assertEquals("I", converter.convert(1));
        Assert.assertEquals("II", converter.convert(2));
    }
}
