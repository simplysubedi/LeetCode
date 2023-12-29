import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums) {
            if (!uniqueNumbers.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] example1 = {1, 2, 3, 1};
        System.out.println("Example 1: " + containsDuplicate(example1));

        int[] example2 = {1, 2, 3, 4};
        System.out.println("Example 2: " + containsDuplicate(example2));

        int[] example3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Example 3: " + containsDuplicate(example3));
    }
}
