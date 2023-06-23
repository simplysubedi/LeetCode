public class DivideTwoInteger {
    public static void main(String[] args){
         int divisor = -1;
        int dividend = -2147483648;
        System.out.println("The quotient is "+ divide(dividend,divisor));
    }
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean isNegative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);

        long absDividend = Math.abs((long)dividend);
        long absDivisor = Math.abs((long)divisor);

        int result = 0;
        while (absDividend >= absDivisor) {
            long temp = absDivisor;
            int quotient = 1;

            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                quotient <<= 1;
            }

            absDividend -= temp;
            result += quotient;
        }

        return isNegative ? -result : result;

    }
}

