import java.util.TreeMap;

public class NumberToRoman {

    private final static TreeMap<Integer, String> ROMAN_CHARACTERS = new TreeMap<Integer, String>();

    static {

        ROMAN_CHARACTERS.put(1000, "M");
        ROMAN_CHARACTERS.put(900, "CM");
        ROMAN_CHARACTERS.put(500, "D");
        ROMAN_CHARACTERS.put(400, "CD");
        ROMAN_CHARACTERS.put(100, "C");
        ROMAN_CHARACTERS.put(90, "XC");
        ROMAN_CHARACTERS.put(50, "L");
        ROMAN_CHARACTERS.put(40, "XL");
        ROMAN_CHARACTERS.put(10, "X");
        ROMAN_CHARACTERS.put(9, "IX");
        ROMAN_CHARACTERS.put(5, "V");
        ROMAN_CHARACTERS.put(4, "IV");
        ROMAN_CHARACTERS.put(1, "I");

    }

    public static String toRoman(int number) throws Exception {
        if(number == 0) return "";
        if(number > 3999 || number < 0) throw new Exception("Numero no soportado");
        int l =  ROMAN_CHARACTERS.floorKey(number);
        if ( number == l ) {
            return ROMAN_CHARACTERS.get(number);
        }
        return ROMAN_CHARACTERS.get(l) + toRoman(number-l);
    }

}
