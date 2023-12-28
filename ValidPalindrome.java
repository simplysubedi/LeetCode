public class ValidPalindrome {
    public static void main(String []args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println("The given string is a valid palindrome: "+isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!isLetter(leftChar)) {
                left++;
                continue;
            }

            if (!isLetter(rightChar)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    private static boolean isLetter(char c) {
        return Character.isLetter(c);
    }
}
