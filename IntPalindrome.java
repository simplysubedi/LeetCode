public class IntPalindrome {
    public static void main(String[] args){
    int num=52525;
        System.out.println("The " +num +" is: "+ isPalindrome( num));
    }
    public static boolean isPalindrome(int x) {
        if( x < 0){
            return false;
        }
        String xStr = Integer.toString(x);
        StringBuilder reversed = new StringBuilder(xStr).reverse();
        return xStr.equals(reversed.toString());

    }
}
