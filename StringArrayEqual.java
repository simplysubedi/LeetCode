public class StringArrayEqual {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2)); // Output: true

        String[] word3 = {"a", "cb"};
        String[] word4 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word3, word4)); // Output: false
    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String word : word1) {
            sb1.append(word);
        }

        // Concatenate the elements of word2
        StringBuilder sb2 = new StringBuilder();
        for (String word : word2) {
            sb2.append(word);
        }

        // Compare the concatenated strings
        return sb1.toString().equals(sb2.toString());
    }
}
