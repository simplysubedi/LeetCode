import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args){
        int[] arr = {48,1,6,23,37,19,21};
        System.out.println("Sorted array: "+ Arrays.toString(radixSort(arr)));

    }

    private static int[] radixSort(int[] arr) {
        int radix = 7;
        int[] quotient = new int [7] ;
        int[] remainder = new int [7] ;
        for(int i = 0; i<arr.length; i++){
            quotient[i] = arr[i] / radix;
            remainder[i] = arr[i] % radix;
        }
        int[] sortedArray = new int [arr.length];
        for(int i = 0,j = 0; i<remainder.length; i++){
            if(remainder[i] == j){
                sortedArray[i]=arr[i];
                j++;
            }
        }
        return sortedArray;
    }
}
