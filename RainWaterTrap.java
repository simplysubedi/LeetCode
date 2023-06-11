public class RainWaterTrap {
    public static void main(String[] args){
       int [] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Total rain collected is: "+trapRain(height));
    }

    private static int trapRain(int[] height) {
            if (height == null || height.length < 3) {
                return 0;
            }

            int left = 0;
            int right = height.length - 1;
            int leftMax = 0;
            int rightMax = 0;
            int totalWater = 0;

            while (left < right) {
                if (height[left] <= height[right]) {
                    if (height[left] > leftMax) {
                        leftMax = height[left];
                    } else {
                        totalWater += leftMax - height[left];
                    }
                    left++;
                } else {
                    if (height[right] > rightMax) {
                        rightMax = height[right];
                    } else {
                        totalWater += rightMax - height[right];
                    }
                    right--;
                }
            }

            return totalWater;
    }
}
