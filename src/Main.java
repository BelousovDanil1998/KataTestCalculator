
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();
        System.out.println(calc(expression));
    }
    public static String calc(String input) throws Exception {
        IntegerToRoman toRoman = new IntegerToRoman();
        RomanToInteger toInteger = new RomanToInteger();
        int result = 0;
        int x1 = 0;
        int x2 = 0;
        String[] NumberArray = input.split(" ");
        if (isRome(NumberArray[0]) & isRome(NumberArray[2])) {
            x1 = toInteger.romanToInteger(NumberArray[0]);
            x2 = toInteger.romanToInteger(NumberArray[2]);
            switch (NumberArray[1]) {
                case "+":
                    result = (x1 + x2);
                    break;
                case "-":
                    result = (x1 - x2);
                    break;
                case "*":
                    result = (x1 * x2);
                    break;
                case "/":
                    result = (x1 / x2);
                    break;
            }
            if (result <= 0) {
                throw new Exception();
            }
            return toRoman.intToRoman(result);
        }
       else if (isArabic(NumberArray[0]) & isArabic(NumberArray[2])) {
            x1 = Integer.parseInt(NumberArray[0]);
            x2 = Integer.parseInt(NumberArray[2]);
            switch (NumberArray[1]) {
                case "+":
                    result = (x1 + x2);
                    break;
                case "-":
                    result = (x1 - x2);
                    break;
                case "*":
                    result = (x1 * x2);
                    break;
                case "/":
                    result = (x1 / x2);
                    break;
            }
            return Integer.toString(result);
        }
        else {throw new Exception();
        }
    }
    public static boolean isArabic (String input) {
       String[] arabic = {"1","2","3","4","5","6","7","8","9","10"};
        for (String an : arabic) {
            if (input.equals(an)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isRome (String input) {
        String[] romans = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        for (String rn : romans) {
            if (input.equals(rn)) {
                return true;
            }
        }
        return false;
    }
}
