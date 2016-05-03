import java.util.HashMap;
import java.util.Map;

/**
 * Created by hakank on 03/05/2016.
 */
public class RomanNumeralServiceImpl implements RomanNumeralConverterService {

    int[] arabic = { 1000, 900, 500, 100, 90, 50, 10, 9, 5, 2, 1 };
    String[] roman = {  "M",  "CM", "D", "C",  "XC", "L",  "X", "IX", "V", "II", "I" };

    //1994 => 1994%1000 = 994; 994%100 =94; 94%10=4;
    // 1994
    Map<Integer, String> mapping = new HashMap<Integer, String>();

    public RomanNumeralServiceImpl() {
        fillMapping();
    }

    private void fillMapping(){
        for(int i=0; i< arabic.length;i++){
            mapping.put(arabic[i], roman[i]);
        }
    }

    public String convert(int arabic) {
        return mapping.get(arabic);
    }
}
