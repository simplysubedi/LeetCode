

public class FindKthLargest_QuickSelect {
    public static void main(String args[]){
        int k = 4;
        int[] num = {3,2,3,1,2,4,5,5,6};
        System.out.println(k+"th largest number is :"+findKthLargest(num, k));
    }

    private static int findKthLargest(int[] num, int k) {
        int left = 0;
        int right = num.length - 1;

        while (left <= right) {
            int pivotIndex = partition(num, left, right);
            if (pivotIndex == k - 1) {
                return num[pivotIndex];
            } else if (pivotIndex < k - 1) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }

        return -1; // Return -1 if k is out of bounds
    }

    private static int partition(int[] num, int left, int right) {
        int pivot = num[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (num[j] >= pivot) {
                i++;
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }

        int temp = num[i + 1];
        num[i + 1] = num[right];
        num[right] = temp;

        return i + 1;
    }
}
