import java.util.Arrays;

public class MinimumSumAfterSplittingDigits {
    public static void main(String args[]){


      /*  You are given a positive integer num consisting of exactly
      four digits. Split num into two new integers new1 and new2 by
      using the digits found in num. Leading zeros are allowed in
      new1 and new2, and all the digits found in num must be used.

                For example, given num = 2932, you have the following
                 digits: two 2's, one 9 and one 3. Some of the possible
                 pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
        Return the minimum possible sum of new1 and new2.
        */
int num = 2932;
        System.out.println("Minimum sum is "+minimumSum(num));

    }
    private static int minimumSum(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        boolean isNew1 = true;
        int new1 = 0;
        int new2 = 0;
        for (char digit : digits) {
            if (isNew1) {
                new1 = new1 * 10 + (digit - '0');
            } else {
                new2 = new2 * 10 + (digit - '0');
            }
            isNew1 = !isNew1;
        }
        return new1+ new2;


        //Below is a beautiful approach to solve the same problem
//return Character.getNumericValue(digits[0])*10+Character.getNumericValue(digits[2])+Character.getNumericValue(digits[1])*10+Character.getNumericValue(digits[3]);

    }
}
