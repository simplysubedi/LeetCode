import java.util.HashMap;


public class ContainsDuplicateII {
    public static void main(String []args){
        int[] nums = {1,2,3,1,2,3};
    int  k = 2;
        System.out.println("The array has nearest duplicate: "+containsNearbyDuplicate(nums, k));
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> duplicateCheck = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (duplicateCheck.containsKey(nums[i])) {
                Integer prevIndex = duplicateCheck.get(nums[i]);
                if (prevIndex != null && Math.abs(i - prevIndex) <= k) {
                    return true;
                }
            }
            else
                duplicateCheck.put(nums[i], i);
        }
duplicateCheck.stream.collect
        return false;

    }
}
