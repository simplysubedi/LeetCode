public class ThreeDivisors {
    public boolean isThreeDivisors(int n) {
        int divisorCount = 0;


        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorCount++;
                if (divisorCount > 3) {
                    return false;
                }
            }
        }
        return divisorCount == 3;
    }

    public static void main(String[] args) {
        ThreeDivisors checker = new ThreeDivisors();

        // Test cases
        System.out.println(checker.isThreeDivisors(4)); // false
        System.out.println(checker.isThreeDivisors(12)); // true
        System.out.println(checker.isThreeDivisors(16)); // false
    }
}
