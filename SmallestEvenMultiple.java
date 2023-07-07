public class SmallestEvenMultiple {
    public static void main(String[] args){
        int num = 5;
        System.out.println("The smallest even multiple is: "+smallestEvenMultiple(num));
    }

    private static int smallestEvenMultiple(int n) {
        if( n % 2 == 0)
            return n;
        else return 2*n;
    }
}
