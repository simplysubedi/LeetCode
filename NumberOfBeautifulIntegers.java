public class NumberOfBeautifulIntegers {
    public static void main(String[] args) {
        int high = 772153463;
        int low = 349863935;
        int k = 3;
        System.out.println("The number of beautiful integers in the given range is: " + numberOfBeautifulIntegers(low, high, k));
    }

    private static int numberOfBeautifulIntegers(int low, int high, int k) {
        return countBeautifulIntegers(high, k) - countBeautifulIntegers(low - 1, k);
    }

    private static int countBeautifulIntegers(int n, int k) {
        if (n < 0) {
            return 0;
        }

        int[] evenCount = new int[10]; // Count of even digits from 0 to 9
        int[] oddCount = new int[10];  // Count of odd digits from 0 to 9

        evenCount[0] = 1; // 0 is the only even digit
        oddCount[0] = 0;

        for (int i = 1; i < 10; i++) {
            evenCount[i] = (i % 2 == 0) ? evenCount[i - 1] + 1 : evenCount[i - 1];
            oddCount[i] = (i % 2 != 0) ? oddCount[i - 1] + 1 : oddCount[i - 1];
        }

        String strN = Integer.toString(n);
        int len = strN.length();
        int beautifulCount = 0;

        for (int i = 0; i < len; i++) {
            int digit = strN.charAt(i) - '0';
            int remainingDigits = len - i - 1;

            if (digit % 2 == 0) {
                beautifulCount += evenCount[digit - 1] * (int) Math.pow(5, remainingDigits);
            } else {
                beautifulCount += oddCount[digit - 1] * (int) Math.pow(5, remainingDigits);
            }

            if (digit % k != 0) {
                break; // If the number is not divisible by k, exit early
            }
        }

        if (isEvenOddEqual(n)) {
            beautifulCount++; // Count n itself if it's beautiful
        }

        return beautifulCount;
    }

    private static boolean isEvenOddEqual(int n) {
        int odd = 0;
        int even = 0;

        while (n != 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            n = n / 10;
        }

        return odd == even;
    }
}
