import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberToRomanTest {

    @Test(expected = Exception.class)
    public void testNumberToRomanException() throws Exception {
        NumberToRoman.toRoman(4000);
    }
    @Test(expected = Exception.class)
    public void testNegativeToRomanException() throws Exception {
        NumberToRoman.toRoman(-1);
    }
    @Test
    public void testNumberToRoman() throws Exception {
        assertEquals("", NumberToRoman.toRoman(0));

        assertEquals("I", NumberToRoman.toRoman(1));
        assertEquals("IV", NumberToRoman.toRoman(4));
        assertEquals("IX", NumberToRoman.toRoman(9));
        assertEquals("X", NumberToRoman.toRoman(10));
        assertEquals("XL", NumberToRoman.toRoman(40));
        assertEquals("L", NumberToRoman.toRoman(50));
        assertEquals("XC", NumberToRoman.toRoman(90));
        assertEquals("C", NumberToRoman.toRoman(100));
        assertEquals("CD", NumberToRoman.toRoman(400));
        assertEquals("D", NumberToRoman.toRoman(500));
        assertEquals("CM", NumberToRoman.toRoman(900));
        assertEquals("M", NumberToRoman.toRoman(1000));
        assertEquals("II", NumberToRoman.toRoman(2));
        assertEquals("III", NumberToRoman.toRoman(3));
        assertEquals("V", NumberToRoman.toRoman(5));
        assertEquals("VI", NumberToRoman.toRoman(6));
        assertEquals("VII", NumberToRoman.toRoman(7));
        assertEquals("VIII", NumberToRoman.toRoman(8));
        assertEquals("XI", NumberToRoman.toRoman(11));
        assertEquals("XII", NumberToRoman.toRoman(12));
        assertEquals("XIII", NumberToRoman.toRoman(13));
        assertEquals("XIV", NumberToRoman.toRoman(14));
        assertEquals("XV", NumberToRoman.toRoman(15));
        assertEquals("XVI", NumberToRoman.toRoman(16));
        assertEquals("XVII", NumberToRoman.toRoman(17));
        assertEquals("XVIII", NumberToRoman.toRoman(18));
        assertEquals("XIX", NumberToRoman.toRoman(19));
        assertEquals("XX", NumberToRoman.toRoman(20));
        assertEquals("XXI", NumberToRoman.toRoman(21));
        assertEquals("XXII", NumberToRoman.toRoman(22));
        assertEquals("XXIII", NumberToRoman.toRoman(23));
        assertEquals("XXIV", NumberToRoman.toRoman(24));
        assertEquals("XXV", NumberToRoman.toRoman(25));
        assertEquals("XXVI", NumberToRoman.toRoman(26));
        assertEquals("XXVII", NumberToRoman.toRoman(27));
        assertEquals("XXVIII", NumberToRoman.toRoman(28));
        assertEquals("XXIX", NumberToRoman.toRoman(29));
        assertEquals("XXX", NumberToRoman.toRoman(30));
        assertEquals("LX", NumberToRoman.toRoman(60));
        assertEquals("LXX", NumberToRoman.toRoman(70));
        assertEquals("LXXX", NumberToRoman.toRoman(80));
        assertEquals("CC", NumberToRoman.toRoman(200));
        assertEquals("CCC", NumberToRoman.toRoman(300));
        assertEquals("DC", NumberToRoman.toRoman(600));
        assertEquals("DCC", NumberToRoman.toRoman(700));
        assertEquals("MM", NumberToRoman.toRoman(2000));
        assertEquals("MMM", NumberToRoman.toRoman(3000));
        assertEquals("MMMCMXCIX", NumberToRoman.toRoman(3999));

    }
}
