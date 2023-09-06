public class NumberAfterDoubleReversal {


    public boolean isPalindromeTwice(int num) {
        int reversed1 = reverseNumber(num);
        int reversed2 = reverseNumber(reversed1);

        return num == reversed2;
    }

    private int reverseNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        NumberAfterDoubleReversal reverseInteger = new NumberAfterDoubleReversal();

        // Test cases
        System.out.println(reverseInteger.isPalindromeTwice(526)); // true
        System.out.println(reverseInteger.isPalindromeTwice(1800)); // false
        System.out.println(reverseInteger.isPalindromeTwice(0)); // true
    }
}
