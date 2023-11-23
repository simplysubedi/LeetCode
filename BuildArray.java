import java.util.Arrays;

public class BuildArray {
    public static void main(String []args){
        int [] nums = {0,2,1,5,3,4};
        int newArray[] = buildArray(nums);
        System.out.println("New array is : "+ Arrays.toString(newArray));
    }
    static int[] buildArray(int[] nums) {
        int[] resultArray = new int [nums.length];
        for(int i = 0; i < nums.length; i++){
            resultArray[i] = nums[nums[i]];
        }
        return resultArray;
    }
}
