import java.util.ArrayList;
import java.util.List;


public class Permutations {
    public static void main(String []args){
int [] nums = {1,2,3};
        System.out.println("Possible permutations are: "+premute(nums).toString());
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int num : nums) {
                if (!tempList.contains(num)) {
                    tempList.add(num);
                    backtrack(nums, tempList, result);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }
}
