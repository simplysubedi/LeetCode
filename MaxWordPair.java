import java.util.HashMap;
import java.util.Map;

public class MaxWordPair {
    public static void main(String[] args) {
        // Example usage
        String[] words = {"abcd", "dcba", "efgh", "hgfe", "ijkl"};
        int pairs = maxWordPairs(words);
        System.out.println("Maximum number of word pairs: " + pairs);
    }

    private static int maxWordPairs(String[] words) {
        int count = 0;
        Map<String, Integer> wordMap = new HashMap<>();
        for(String word: words){
            String reverse = new StringBuilder(word). reverse().toString();
            if(wordMap.containsKey(reverse) && wordMap.get(reverse) >0 ) {
                count++;
                wordMap.put(reverse, wordMap.get(reverse) - 1);
            }
            else{
                wordMap.put(word, wordMap.getOrDefault(word, 0) +1);
            }
            }
        return count;
        }
    }

