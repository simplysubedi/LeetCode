public class TrapRainWater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Total rain collected is: " + trapRainWater(height));
    }

    public static int trapRainWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        int left_max = 0;
        int right_max = 0;
        while (left <= right) {
            if (height[left] < height[right]) {
                if (left_max > height[left]) {
                    res += left_max - height[left];
                } else {
                    left_max = height[left];
                }
                left++;
            } else {
                if (right_max > height[right]) {
                    res += right_max - height[right];
                } else {
                    right_max = height[right];
                }
                right--;
            }


        }
        return res;
    }
}

