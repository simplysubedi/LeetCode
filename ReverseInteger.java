public class ReverseInteger {
    public static void main(String []args){
        int num = 15643;
        System.out.println("The reverse is: "+reverseInt(num));
    }

    private static int reverseInt(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
    }
}
