import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateReturnNewArray {
    public static void main(String[] args){
        int[] nums = {0,2,2,5,6,6,9,9,10};
        System.out.println("The number of unique elements in nums is: "+Arrays.toString(removeDuplicate(nums)));

    }

    private static int[] removeDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            uniqueNums.add(nums[i]);
        }
        int[] result = new int[uniqueNums.size()];
        int index = 0;
        for (int num : uniqueNums) {
            result[index++] = num;
        }

        return result;

    }
}
