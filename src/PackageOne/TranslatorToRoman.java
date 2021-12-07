package PackageOne;

import java.io.IOException;
import java.util.TreeMap;

public class TranslatorToRoman {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static String decimalToRoman(int number) {
        if (number < 1 || number > 101)
            throw new NullPointerException();
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + decimalToRoman(number - l);
    }
}
