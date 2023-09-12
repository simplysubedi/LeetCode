import java.util.Arrays;

public class PerfectSquares {
    public static void main(String args[]){
        int num =500;
        System.out.println("The least number of perfect squares that adds to "+num +" is "+numSquares( num) );
    }

    private static int numSquares(int n) {
        int[] dp = new int[n + 1];

        // Initialize dp with maximum values
        Arrays.fill(dp, Integer.MAX_VALUE);

        // Base case: 0 can be represented by 0 perfect squares
        dp[0] = 0;

        // Calculate the minimum number of perfect squares for each number from 1 to n
        for (int i = 1; i <= n; i++) {
            // Try using each perfect square less than or equal to i
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[n];
    }
}
