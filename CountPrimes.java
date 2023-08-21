public class CountPrimes {
    public static void main(String[] args){
        int num = 10;
        System.out.println("The number of primes less than given number is : "+countPrimes(num));
    }

    private static int countPrimes(int num) {
        int count = 0;
        for(int i = 2; i< num; i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int i) {
        if (i <= 1) {
            return false;
        }

        if (i <= 3) {
            return true;
        }

        if (i <= 1 || i % 2 == 0 || i % 3 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(i);
        for (int j = 5; j <= sqrt; j += 6) {
            if (i % j == 0 || i % (j + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
