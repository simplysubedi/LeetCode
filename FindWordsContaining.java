
import java.util.ArrayList;

import java.util.List;

public class FindWordsContaining {
    public static void main(String [] args){
        String [] words = {"abc","bcd","aaaa","cbc"};
    char  testChar = 'a';
        System.out.println("The array that contains "+ testChar+" is "+  findWordsContaining(words, testChar) );
    }

    private static List<Integer> findWordsContaining(String[] words, char testChar) {
        List<Integer> resultList = new ArrayList<>();
        String s = String.valueOf(testChar);
        for (int i = 0; i < words.length; i++){
            if(words[i].contains(s)){
                resultList.add(i);
            }
        }
        return resultList;
    }
}
