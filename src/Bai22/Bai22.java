package Bai22;
public class Bai22{
    public static void main(String[] args) {
        String s1 = "  ";
        String s2 = null;
        String s3 = "a123";
        String s4 = "123";
        String s5 = "1.23";
        String s6 = "1.23d";
        String s7 = "1.23f";
        String s8 = "1.23a";

        
        System.out.println(Converter.stringToInt(s1));  // Output: 0
        System.out.println(Converter.stringToInt(s2));  // Output: 0
        System.out.println(Converter.stringToInt(s3));  // Output: 0
        System.out.println(Converter.stringToInt(s4));  // Output: 123
        System.out.println(Converter.stringToDouble(s5));  // Output: 1.23
        System.out.println(Converter.stringToDouble(s6));  // Output: 0.0
        System.out.println(Converter.stringToDouble(s7));  // Output: 1.23
        System.out.println(Converter.stringToDouble(s8));  // Output: 0.0
    }
}