public class NumberOfBeautifulIntegers1 {
    public static void main(String [] args){
        int high = 772153463;
        int low = 349863935;
        int k =3;
        System.out.println("The number of beautiful integers in the given range is : "+numberOfBeautifulIntegers(low, high, k));
    }

    private static Object numberOfBeautifulIntegers(int low, int high, int k) {
        int result = 0;
        for(int i = low; i <= high; i++){
            if(isEvenOddEqual(i) && i % k ==0){
                result++;
            }
        }
        return result;
    }

    private static boolean isEvenOddEqual(int i) {
        int odd = 0;
        int even = 0;
        while(i!=0){
             int digit = i % 10;
             if(digit % 2 ==0){
                 even++;}
              else
                  odd++;

            i = i /10;

        }
        return odd==even;
    }
}
