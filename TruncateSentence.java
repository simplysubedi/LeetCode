public class TruncateSentence {
    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder truncatedSentence = new StringBuilder();

        for (int i = 0; i < k; i++) {
            truncatedSentence.append(words[i]);
            if (i != k - 1) {
                truncatedSentence.append(" ");
            }
        }

        return truncatedSentence.toString();
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String truncatedSentence = truncateSentence(s, k);
        System.out.println(truncatedSentence);
    }
}
