public class SingleNumber {
    public static void main(String[] args){
        int[] nums = {2,2,1};
        System.out.println("The single number is :"+singleNumber(nums));

    }

    private static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
