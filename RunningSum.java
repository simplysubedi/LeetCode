import java.util.Arrays;

public class RunningSum {
    public static void main(String args[]){
        int[] nums = {1,2,5,3,6,3};
        System.out.println("Running sum is as: " + Arrays.toString((runningSum(nums))));
    }

    static int[] runningSum(int[] nums) {

        int [] resultArray = new int [nums.length];
        int sum = nums[0];
        resultArray[0] = sum;
        for(int i = 1; i < nums.length; i++){

            sum = sum + nums[i];
            resultArray[i] = sum;
        }

        return resultArray;
    }
}
