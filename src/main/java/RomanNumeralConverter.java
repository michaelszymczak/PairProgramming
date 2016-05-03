
public class RomanNumeralConverter implements RomanNumeralConverterService {

    RomanNumeralConverterService service;

    public RomanNumeralConverter(RomanNumeralConverterService service) {
        this.service = service;
    }

    public String convert(int arabic) {
        return service.convert(arabic);


    }
}
