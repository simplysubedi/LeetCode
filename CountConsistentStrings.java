import java.util.HashSet;
import java.util.Set;

public class CountConsistentStrings {
    public static void main(String[] args){
        String[] words = {"ad","bd","aaab","baa","badab"};

    String allowed = "ab";
        System.out.println("total no of consistent strings are: "+countConsistentStrings(words,allowed));
    }

    private static int countConsistentStrings(String[] words, String allowed) {
            Set<Character> allowedSet = new HashSet<>();
            for (char c : allowed.toCharArray()) {
                allowedSet.add(c);
            }

            int consistentCount = 0;

            for (String word : words) {
                if (isConsistent(word, allowedSet)) {
                    consistentCount++;
                }
            }

            return consistentCount;
        }

        private static boolean isConsistent (String word, Set < Character > allowedSet){
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    return false;
                }
            }
            return true;
        }
    }