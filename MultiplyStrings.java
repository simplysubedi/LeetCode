import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String []args){
        String num1 = "123";
        String num2 = "456";
        System.out.println("The product is: "+multiply(num1, num2));
    }

    private static String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];  // Stores intermediate results

        // Perform multiplication
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;    // Store the digit
                result[i + j] += sum / 10;       // Carry over
            }
        }

        // Convert result to string
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            sb.append(digit);
        }

        // Remove leading zeroes
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
