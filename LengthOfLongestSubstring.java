import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String []args){
   String str = "sjdkaflsjfi";
        System.out.println("The longest substring is: "+lengthOfLongestSubstring(str));
    }

    private static int lengthOfLongestSubstring(String str) {
        String result = "";
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;

        while (right < str.length()) {
            if (!set.contains(str.charAt(right))) {
                set.add(str.charAt(right));
                right++;
                if (right - left > result.length()) {
                    result = str.substring(left, right);
                }
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }

        return result.length();
    }
}
