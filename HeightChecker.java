import java.util.Arrays;

public class HeightChecker {
    public static void main(String []args){
        int [] heights = {1,1,4,2,1,3};
        System.out.println("The number where heights[i] != expected[i] is : "+    heightChecker( heights) );
}

    private static int heightChecker(int[] heights) {
        int [] expected = Arrays.copyOf(heights , heights.length);
        Arrays.sort(expected);
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i])
                count++;
        }
        return count;
    }
    }
