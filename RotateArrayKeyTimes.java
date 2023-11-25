import java.util.Arrays;

public class RotateArrayKeyTimes {
    public static void main(String []args){
        int []arr = {3,4,5,6,7,8,9,1,2};
        int key = 2;
        System.out.println("New array is :"+ Arrays.toString(rotationArray(arr, key% arr.length)));
    }

    private static int[] rotationArray(int[] arr, int key) {
//        int count = 0;
//        int temp = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length - 1; i++){
//            if(temp == Integer.MAX_VALUE){
//                temp = arr[0];
//            }
//            if(i == key )
//                continue;
//            arr[i] = arr[(i+key+1)% (arr.length)];
//            if(count == arr.length) {break;}
//            count ++;
//        }
//        arr[key ]=temp;
//        return arr;
//    }
        int n = arr.length;
        key = key % n;  // Ensure key is within the range of array size

        // Reverse the entire array
        reverse(arr, 0, n-1);

        // Reverse the first part of the array
        reverse(arr, 0, key-1);

        // Reverse the second part of the array
        reverse(arr, key, n-1);
return arr;
    }
    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
