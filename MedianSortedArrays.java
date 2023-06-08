import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianSortedArrays {
    public static void main(String[]args){
    int []nums1 = {1,2,3,4};
    int []nums2 = {5,6};
        System.out.println("The median of arrays is: "+findMedianSortedArrays(nums1,nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (j < nums1.length && k < nums2.length) {
            if (nums1[j] < nums2[k]) {
                mergedArray[i] = nums1[j];
                j++;
            } else {
                mergedArray[i] = nums2[k];
                k++;
            }
            i++;
        }

        while (j < nums1.length) {
            mergedArray[i] = nums1[j];
            i++;
            j++;
        }

        while (k < nums2.length) {
            mergedArray[i] = nums2[k];
            i++;
            k++;
        }
        System.out.println(Arrays.toString(mergedArray));
        if(mergedArray.length % 2 != 0){
         return   mergedArray[mergedArray.length/2];
        }
        else
            return((mergedArray[mergedArray.length/2-1]+mergedArray[mergedArray.length/2])/2f);
    }
}
