import java.util.Arrays;
import java.util.List;

public class IsAcronym {
    public static void main(String []args){
        String []wordsAsString = {"never","gonna","give","up","on","you"};
        List<String> words = Arrays.stream(wordsAsString).toList();
       String s = "ngguoy";
        System.out.println("The given string is acronym: "+isacrnym(words, s));
    }

    private static boolean isacrnym(List<String> words, String s) {
        String temp = "";
        for(String word: words){
            temp += word.charAt(0);
        }
        return s.equals(temp);
    }
}
