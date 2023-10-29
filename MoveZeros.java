public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int nonZeroPointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroPointer] = nums[i];
                nonZeroPointer++;
            }
        }
        for (int i = nonZeroPointer; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        MoveZeros solution = new MoveZeros();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
