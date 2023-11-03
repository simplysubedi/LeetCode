public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(reverseString(word)).append(" ");
        }
        return result.toString().trim();
    }

    private static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String input = "Let's take LeetCode contest";
        String reversed = reverseWords(input);
        System.out.println(reversed);
    }
}
