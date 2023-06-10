public class ContainerWithMostWater_Optimized {public static void main(String [] args){
    int [] heights ={1,8,6,2,5,4,8,3,7};
    System.out.println("The maximum area is : "+maxArea(heights));
}

    private static int maxArea(int[] heights) {
        int area = 0;
        int left = 0;
        int right = heights.length-1;
        while(left <right){
            int width = right - left;
            int height = Math.min(heights[left],heights[right]);
            int tempArea = width*height;
            if(area < tempArea){
                area = tempArea;
            }
            if(heights[left] <= heights[right]){
                left++;

            }
            else{
                right--;
            }

        }

        return area;
    }
}
