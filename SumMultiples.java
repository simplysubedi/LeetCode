public class SumMultiples {
    public static void main(String [] args){
        int n = 7;
        System.out.println("The sum of multiples is: "+sumOfMultiples(n));
    }

    private static int sumOfMultiples(int n) {
        int count = 0;
        while(n > 0){
            if( n % 3 == 0 || n % 5 ==0 || n % 7 ==0){
                count +=n;
            }
            n--;
        }
        return count;
    }
}
