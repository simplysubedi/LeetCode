import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String args[]) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] reshuffledArray = shuffleArray(nums, n);
        System.out.println("Reshuffled array is: " + Arrays.toString(reshuffledArray));
    }

    static int[] shuffleArray(int[] nums, int n) {
        int[] result = new int[2 * n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            result[j++] = nums[i];
            result[j++] = nums[i + n];
        }

        return result;
    }
}
