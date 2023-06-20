import java.lang.reflect.Array;

public class CanBeIncreasing {
    public static void main(String[] args){
        int [] nums = {1,25,8,32,9};
        System.out.println("The array can be made increasing : "+canBeIncreasing(nums));

    }
    public static boolean canBeIncreasing(int[] nums) {
//        int [] tempArray = new int[nums.length - 1];
//        for(int i = 0; i < nums.length; i++){
//            System.arraycopy(nums, 0, tempArray, 0, i);
//            System.arraycopy(nums, i + 1, tempArray, i, nums.length - i - 1);
//            if(isStrictlyAscending(tempArray))
//               return true;
//        }
//        return false;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]) {
                if (count == 1) {
                    return false;
                }
                if (i == 1 || nums[i] > nums[i-2]) {
                    nums[i-1] = nums[i];
                } else {
                    nums[i] = nums[i-1];
                }
                count++;
            }
        }
        return true;
    }
    public static boolean isStrictlyAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
