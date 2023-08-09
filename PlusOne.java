import java.sql.Array;
import java.util.Arrays;

public class PlusOne {
    public static void main(String [] args){
        int[] digits = {1,5,6,9,9};
        System.out.println("New plused one array is: "+ Arrays.toString(plusOne(digits)));
    }



    static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int total = digits[i] + carry;
            digits[i] = total % 10;
            carry = total / 10;
            if (carry == 0) {
                break;
            }
        }

        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            for (int i = 1; i <= digits.length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        }

        return digits;
    }
}
