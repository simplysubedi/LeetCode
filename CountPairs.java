import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPairs {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums.get(i);
        }

        Arrays.sort(arr);
        int count = 0;

        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountPairs countPairs = new CountPairs();

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 1, 3, 4, 5));
        int target = 6;
        System.out.println(countPairs.countPairs(nums, target));  // Output will be 4
    }
}