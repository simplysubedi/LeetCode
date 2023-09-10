public class CommonFactor {
    public static int commonFactors(int a, int b) {
        // Calculate the GCD of a and b using the Euclidean algorithm
        int gcdAB = 0;
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcdAB = i;
            }
        }

        // Count the number of divisors of the GCD
        int commonFactors = 0;
        for (int i = 1; i <= gcdAB; i++) {
            if (gcdAB % i == 0) {
                commonFactors++;
            }
        }

        return commonFactors;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int result = commonFactors(a, b);
        System.out.println("Number of common factors of " + a + " and " + b + " is: " + result);
    }
}