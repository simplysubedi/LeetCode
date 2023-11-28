import java.lang.reflect.Array;
import java.util.*;

public class OddStringDifference {
    public static void main(String []args){
        String [] words = {"ddd","poo","baa","onn"};
        System.out.println("The odd string is: " +(words[oddString(words)]));
    }

    private static int oddString(String[] words) {
       List<String> resultList = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
           resultList.add(differenceArray(words[i]));
        }
        System.out.println(resultList);
return findIndexOfunique(resultList);
    }

    private static int findIndexOfunique(List<String> resultList) {
       int result = 0;
        for( int i = 0; i < resultList.size(); i++){
            int count = 0;
           String sampleString = resultList.get(i).toString();
            for( int j = 0; j < resultList.size() ; j++){
                if(sampleString.equalsIgnoreCase(resultList.get(j).toString())){
                    count++;
                }
            }
          if (count == 1) {
              result = i;
          }
        }
        return result;
    }

    private static String differenceArray(String word){
        int [] resultArray = new int[word.length()-1];
       for(int i = 0; i < word.length()-1; i++){
            resultArray[i] = word.charAt(i+1)-word.charAt(i);
       }
       return Arrays.toString(resultArray);
   }
}
