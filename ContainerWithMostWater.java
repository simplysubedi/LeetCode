public class ContainerWithMostWater {
    public static void main(String [] args){
        int [] heights ={1,8,6,2,5,4,8,3,7};
        System.out.println("The maximum area is : "+maxArea(heights));
    }

    private static int maxArea(int[] heights) { int area=0;
        int tempArea = 0;
        for(int i = 0; i <heights.length; i++){
            for(int j = i+1; j <=heights.length-1 ; j++){
                if(heights[i] < heights[j]){
                    tempArea = heights[i]*(j-i);

                    if(area< tempArea){
                        area = tempArea;
                    }
                }
                else if(heights[i] > heights[j]){
                    tempArea = heights[j]*(j-i);

                    if(area< tempArea){
                        area = tempArea;
                    }
                }
                else
                    tempArea = heights[i]*(j-i);

                if(area< tempArea){
                    area = tempArea;
                }
            }
        }

        return area;
    }
}
