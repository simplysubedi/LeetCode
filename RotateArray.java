import java.util.Arrays;

public class RotateArray {
    public static void main(String []args){
        int []arr = {2,5,1,3,4,3};
        System.out.println("New array is :"+Arrays.toString(rotationArray(arr)));
    }

    private static int[] rotationArray(int[] arr) {
        int temp = Integer.MAX_VALUE;
     for (int i = 0; i < arr.length - 1; i++){
         if(temp == Integer.MAX_VALUE){
             temp = arr[i];
         }
        arr[i] = arr[i+1];
     }
     arr[arr.length-1 ]=temp;
     return arr;
    }
}
