import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralConverterTest {

    @Test
    public void shouldConvertToRoman() throws Exception {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        Assert.assertEquals("I", converter.convert(1));
        Assert.assertEquals("II", converter.convert(2));
    }
}
