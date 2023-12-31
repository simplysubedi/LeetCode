import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1, 5, 9, 0, 0, 0};
        int[] num2 = {2, 5, 8};
        int m = 3;
        sortArray(num1, num2, m, num2.length);
        System.out.println("New sorted array is: "+ Arrays.toString(num1));
    }

    private static void sortArray(int[] nums1, int[] nums2, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }


        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}