public class NumberOfCuts {
    public static void main(){
        int num = 6;
        System.out.println(numberOfCuts(num));
    }

    private static int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        } else if (n % 2 ==1) {
            return n;
        } else {
            return n /2;
        }
    }
}
