


//Done but time limit exceeded in leetcode

public class LongestPalindrome {
    public static void main(String []args){
        String s = "bbbb";
        System.out.println("The longest substring is:  "+ longestPalindrome(s));

    }

    private static String longestPalindrome(String s) {
        String longestSubString = "";
        int palindromeLength = 0;
        if (s.length() < 2) {
            return s;}
            for (int i = 0; i < s.length() - 1 ; i++) {
                for (int j = s.length() ; j >= i; j--) {
                    String subStringCheck = s.substring(i, j);
                    if (isPalindrome(subStringCheck)) {
                        if (palindromeLength < subStringCheck.length()) {
                            longestSubString = subStringCheck;
                            palindromeLength = subStringCheck.length();
                            break;
                        }
                    }
                }
            } return longestSubString;
        }

       public static boolean isPalindrome(String subString){
            int left = 0;
            int right = subString.length() - 1;
            while(left < right){
                if(subString.charAt(left) != subString.charAt(right))
                    return false;
                left++;
                right--;
            }
            return true;
        }
    }

