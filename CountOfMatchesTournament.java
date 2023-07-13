public class CountOfMatchesTournament {
    public static void main(String[] args){
        int num = 7;
        System.out.println("Total number of match to be played until a winner is decided is : "+numberOfMatches(num));
    }

    private static int numberOfMatches(int num) {
        int count = 0;
        if (num < 0 ){
            return 0;
        }
        while ( num != 1){
            if(num % 2 == 0){

                count += num/2;
                num = num/2;
            }
            else{

            count += (num-1)/2;
                num = (num - 1) / 2 +1;
            }

        }
        return count;
    }
}
