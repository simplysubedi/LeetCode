import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String num = "III";
        System.out.println("The int value of " + num + " is: " + romanToInt(num));
    }

    private static int romanToInt(String num) {
        Map<Character, Integer> romToCHar = new HashMap<>();
        romToCHar.put('I', 1);
        romToCHar.put('V', 5);
        romToCHar.put('X', 10);
        romToCHar.put('L', 50);
        romToCHar.put('C', 100);
        romToCHar.put('D', 500);
        romToCHar.put('M', 1000);
        int val = 0;
        for (int j = 0; j <= num.length() - 1; j++) {
            if (j != num.length()-1 && romToCHar.get(num.charAt(j)) < romToCHar.get(num.charAt(j + 1)) ) {
                val -= romToCHar.get(num.charAt(j));
            } else val += romToCHar.get(num.charAt(j));
        }
        return val;
    }
}
