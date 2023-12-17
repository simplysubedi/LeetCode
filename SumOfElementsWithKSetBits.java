public class SumOfElementsWithKSetBits {



    public static int sumOfElements(int[] nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (countSetBits(i) == k) {
                result += nums[i];
            }
        }
        return result;
    }
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums1 = {5, 10, 1, 5, 2};
        int k1 = 1;
        System.out.println(sumOfElements(nums1, k1));


        int[] nums2 = {4, 3, 2, 1};
        int k2 = 2;
        System.out.println(sumOfElements(nums2, k2));
    }
}