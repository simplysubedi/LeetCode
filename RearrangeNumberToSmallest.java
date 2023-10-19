import java.util.Arrays;

public class RearrangeNumberToSmallest {
    public int rearrangeDigits(int num) {
        // Convert the number to a string for easier manipulation
        if (num == 0) {
            return 0;
        }

        boolean isNegative = num < 0;
        String numStr = String.valueOf(Math.abs(num));
        char[] digits = numStr.toCharArray();
        Arrays.sort(digits);

        StringBuilder sb = new StringBuilder();

        // Handle negative sign if present
        if (isNegative) {
            sb.append("-");
        }

        // Find the index of the first non-zero digit
        int firstNonZero = 0;
        while (firstNonZero < digits.length && digits[firstNonZero] == '0') {
            firstNonZero++;
        }

        // Construct the minimized number as a string
        for (int i = firstNonZero; i < digits.length; i++) {
            sb.append(digits[i]);
        }

        // Convert the string back to an integer
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        RearrangeNumberToSmallest solution = new RearrangeNumberToSmallest();
        int num = 143221900;
        System.out.println(solution.rearrangeDigits(num));
    }
}
