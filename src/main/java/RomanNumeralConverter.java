
public class RomanNumeralConverter implements RomanNumeralConverterService {

    public String convert(int arabic) {
        if (arabic == 2)
            return "II";
        return "I";
    }
}
