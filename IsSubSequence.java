public class IsSubSequence {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0, tPointer = 0;
        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }
        return sPointer == s.length();
    }

    public static void main(String[] args) {
        IsSubSequence checker = new IsSubSequence();
        String s = "ace";
        String t = "abcde";
        System.out.println(checker.isSubsequence(s, t)); // true

        String s2 = "aec";
        String t2 = "abcde";
        System.out.println(checker.isSubsequence(s2, t2)); // false
    }
}
