public class DifferenceOfSum {
    public static void main(String[] args) {
        int[] nums = {1, 15, 6, 3};
        System.out.println("The absolute difference between the element sum and digit sum of nums is: " + differenceOfSum(nums));
    }

    private static int differenceOfSum(int[] nums) {
        int sumOfNums = 0;
        int sumOfDigits = 0;
        for (int i = 0; i < nums.length; i++){
            sumOfNums += nums[i];
            sumOfDigits += sumOfDigits(nums[i]);
        }

        return Math.abs( sumOfDigits - sumOfNums);
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num =num/10;
        }
        return sum;
    }
}
