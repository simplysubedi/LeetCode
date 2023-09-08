

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1};
        int[] concatenatedArray = getConcatenation(nums);

        System.out.print("New concatenated array is: ");
        for (int i = 0; i < concatenatedArray.length; i++) {
            System.out.print(concatenatedArray[i] + " ");
        }
        System.out.println();
}

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

}
