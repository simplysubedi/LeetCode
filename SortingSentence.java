import java.util.Arrays;
import java.util.Comparator;

public class SortingSentence {
    public static void main(String[] args) {
        String shuffledSentence = "sentence4 a3 is2 This1";
        String originalSentence = reconstructSentence(shuffledSentence);
        System.out.println("Original Sentence: " + originalSentence);
    }


    public static String reconstructSentence(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words, Comparator.comparingInt(a -> Integer.parseInt(a.replaceAll("\\D", ""))));
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.replaceAll("[0-9]", "")).append(" ");
        }
        return sb.toString().trim();
    }
}
