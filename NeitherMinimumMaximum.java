import java.util.Arrays;

public class NeitherMinimumMaximum {
    public static void main(String []args){
        int[] nums = {8,6,9,4,5};
        System.out.println("Neither max nor min is: "+findNonMinOrMax(nums));
    }

    private static int findNonMinOrMax(int[] nums) {
        if (nums == null || nums.length < 3) {
            return -1;
        }

        Arrays.sort(nums);

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[0] && nums[i] < nums[nums.length - 1]) {
                return nums[i];
            }
        }

        return -1;
    }
}
