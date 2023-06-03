public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int[] nums1 = {1, 3, 5, 6};
        int[] nums2 = {1, 3, 5, 6};

        int target = 7;
        int target1 = 2;
        int target2 = 5;

        System.out.println(searchInsert(nums, target));
        System.out.println(searchInsert(nums1, target1));
        System.out.println(searchInsert(nums2, target2));


    }

    public static int searchInsert(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int midIndex = 0;
        //int expectedIndex;
        if (nums[0] > target) return 0;
        if (nums[nums.length - 1] < target) return nums.length;

        while (leftIndex < rightIndex) {
            midIndex = (leftIndex + rightIndex) / 2;

            if (nums[midIndex] < target) {
                leftIndex = midIndex + 1 ;

            }
            else if (nums[midIndex] > target) {
                rightIndex = midIndex ;

            }
            else  {
                return midIndex;
            }


        }
        return leftIndex;
    }
}
