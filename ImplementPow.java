public class ImplementPow {
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / powUtil(x, -((long) n));
        } else {
            return powUtil(x, n);
        }
    }

    private static double powUtil(double x, long n) {
        if (n == 0) {
            return 1;
        }

        double half = powUtil(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    public static void main(String[] args) {
        double x = 2;
        int n = -2147483648;
        double result = pow(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}
