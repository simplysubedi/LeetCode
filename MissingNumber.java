import java.util.Arrays;

public class MissingNumber {
    public static void main(String argd[]){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing number is : "+  missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        int n = nums.length;
        int missing = 0;
        for (int i = 0; i <= n; i++) {
            missing ^= i;
        }
        for (int num : nums) {
            missing ^= num;
        }

        return missing;}
}
