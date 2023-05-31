import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 9;
        int[] resultArray = findTowSum(nums, target);
        System.out.println("Two Sum for the given array is : " + Arrays.toString(resultArray));
    }

    private static int[] findTowSum(int[] nums, int target) {
        HashMap<Integer,Integer>compDict=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(compDict.containsKey(complement)){
                return new int[]{compDict.get(complement),i};
            }
            compDict.put(nums[i],i);
        }

        return null;
    }
}
