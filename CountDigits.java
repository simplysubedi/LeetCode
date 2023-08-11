public class CountDigits {
    public static void main(String[] args){
        int num = 435435;
        System.out.println("The number of digits in "+num +" that divides "+num +" is :"+countDigits(num));
    }

    private static int countDigits(int num) {
        int count = 0;
        int digit;
        int temp = num;
        while(temp != 0){
          digit = temp % 10;
          if(num % digit == 0){
              count++;
          }

            temp = temp/10;
        }
        return count;
    }
}
