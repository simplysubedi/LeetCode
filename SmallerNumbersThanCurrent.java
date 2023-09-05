import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerNumbersThanCurrent {
    public static void main(String []args){
        SmallerNumbersThanCurrent solution = new SmallerNumbersThanCurrent();
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = solution.smallerNumbersThanCurrent(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: [4, 0, 1, 1, 3]
    }

    private int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] sortedNums = Arrays.copyOf(nums, n);
        Arrays.sort(sortedNums);
        Map<Integer, Integer> numFreq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            numFreq.putIfAbsent(sortedNums[i], i);
        }
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = numFreq.get(nums[i]);
        }

        return result;
    }
}

