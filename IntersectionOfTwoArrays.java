import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args){
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};
        int[] result = intersectionArray(nums1, nums2);

        System.out.print("The intersection of two arrays is : ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }    }

    private static int[] intersectionArray(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        for (int num: nums1){
            for (int num1: nums2){
                if(num == num1)
                    result.add(num);
            }
        }
        int[] resultArray = new int[result.size()];
        int index = 0;
        for (int num : result) {
            resultArray[index++] = num;
        }

        return resultArray;
    }
}
