import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceOfTwoArrays {


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        List<List<Integer>> answer = findMissingNumbers(nums1, nums2);

        System.out.println(answer);
    }

    public static List<List<Integer>> findMissingNumbers(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> missingNums1 = new ArrayList<>();
        List<Integer> missingNums2 = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                missingNums1.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                missingNums2.add(num);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(missingNums1);
        answer.add(missingNums2);

        return answer;
    }
}
