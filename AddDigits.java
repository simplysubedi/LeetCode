public class AddDigits {
    public static void main(String[] args){
        int num = 5646;
        System.out.println("The single digit at the end is: "+addDigit(num));
    }
    public static int addDigit(int num){ while (num >= 10) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        num = sum;
    }
        return num;
    }
}
