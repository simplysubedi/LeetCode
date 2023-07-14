public class FibonacciNumber {
    public static void main(String[] args){
        int num = 6;
        System.out.println("The "+num+"th fibonacci number is: "+fib(num));
    }

    private static int fib(int num) {
        if (num == 0 || num == 1)
            return num;
        return fib(num - 1) + fib(num -2);
    }
}
