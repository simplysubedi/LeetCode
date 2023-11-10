import java.util.HashMap;
import java.util.Map;

public class MaximumWordsInSentence {

    public static int maxWords(String[] sentences) {
        Map<Integer, Integer> wordCountMap = new HashMap<>();
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            int wordCount = words.length;
            wordCountMap.put(wordCount, wordCountMap.getOrDefault(wordCount, 0) + 1);
        }
        int maxWords = 0;
        for (int wordCount : wordCountMap.keySet()) {
            maxWords = Math.max(maxWords, wordCount);
        }
        return maxWords;
    }

    public static void main(String[] args) {
        String[] sentences = {"This is a sample sentence", "Another example", "Yet another sample sentence"};
        System.out.println(maxWords(sentences)); // Output: 5
    }
}
