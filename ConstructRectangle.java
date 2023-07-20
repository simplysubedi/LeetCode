import java.util.Arrays;

public class ConstructRectangle {
    public static void main(String[] args) {
        int num = 4;
        System.out.println("L W array is :" + Arrays.toString(constructRectangle(num)));
    }

    public static int[] constructRectangle(int num) {
        int[] result = new int[2];
        int sqrtArea = (int) Math.sqrt(num);
        for (int i = sqrtArea; i >= 1; i--) {
            if (num % i == 0) {
                result[0] = num / i;
                result[1] = i;
                break;
            }


        }
        return result;
    }
}