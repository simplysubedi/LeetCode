public class PowerOfTwo {
    public static void main(String[] args){
        int num = 17;
        System.out.println("The given number is power of two : "+isPowerOfTwo(num));
    }

    private static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        else if (n <= 0 || n % 2 != 0) {
            return false;
        }
        else {
            return isPowerOfTwo(n / 2);
        }
    }
}
