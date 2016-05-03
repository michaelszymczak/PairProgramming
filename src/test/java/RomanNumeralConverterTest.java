import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RomanNumeralConverterTest {

    RomanNumeralConverterService mockService;
    RomanNumeralConverter converter;

    @Before
    public void setUp() throws Exception {
        mockService = mock(RomanNumeralConverterService.class);
        converter = new RomanNumeralConverter(mockService);
    }


    @Test
    public void shouldConvertToRomanWithMock() throws Exception {
        when(mockService.convert(5)).thenReturn("V");
        Assert.assertEquals("V", converter.convert(5));
    }


}
