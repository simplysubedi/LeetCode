public class ImplementPow {
    public static void main(String[] args){
        int x = 2;
        int n = 10;
        System.out.println("The result of pow ing is "+myPow(x,n));
    }

    private static int myPow(int x, int n) {
        int result = 1;
        while(n > 2){
            result *= x;
            n--;
        }
        return result;
    }
}
