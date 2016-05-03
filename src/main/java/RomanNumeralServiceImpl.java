import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralServiceImpl implements RomanNumeralConverterService {

    int[] arabic = { 1000, 900, 500, 100, 90, 50, 10, 9, 5, 3, 2, 1 };
    String[] roman = {  "M",  "CM", "D", "C",  "XC", "L",  "X", "IX", "V", "III", "II", "I" };

    Map<Integer, String> mapping = new LinkedHashMap<Integer, String>();

    public RomanNumeralServiceImpl() {
        fillMapping();
    }

    private void fillMapping(){
        for(int i=0; i< arabic.length;i++){
            mapping.put(arabic[i], roman[i]);
        }

    }

    public String convert(int arabic) {

        int remainingArabicValue = arabic;
        String roman = "";

        for (Map.Entry<Integer,String> arabicAndRomanPair : mapping.entrySet()) {
            while (remainingArabicValue >= arabicAndRomanPair.getKey()) {
                remainingArabicValue -= arabicAndRomanPair.getKey();
                roman += arabicAndRomanPair.getValue();
            }
        }

        return roman;
    }
}
