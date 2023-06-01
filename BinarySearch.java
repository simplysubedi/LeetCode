public class BinarySearch {
    public static void main(String[] args){
        int []nums={0,2,3,4,8,10};
        int target=4;
        System.out.println("The number is in :"+binarySearch(nums,target) + " index.");
    }


    public static int binarySearch(int[] nums, int target) {

        int initNum = 0;
        int endNum = nums.length - 1;

        while ( initNum <= endNum) {
            int midIndex = (initNum + endNum)/2;

            if(nums[midIndex]  > target)
                endNum = midIndex - 1;
            else if(nums[midIndex] < target)
                initNum = midIndex + 1;
            else
                return midIndex;
        }
        return -1;

    }
}
