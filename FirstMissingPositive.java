import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FirstMissingPositive {
    public static void main(String[] args){
        int [] nums ={1};
        System.out.println("The first missing positive integer is: "+firstMissingPositive(nums));
    }

    private static int firstMissingPositive(int[] nums) {
        int result = 0;
        List<Integer> numList = Arrays.stream(nums).boxed().toList();
       for(int i = 1 ; i <= numList.size() + 1; i++){
           if(!numList.contains(i)){
               result = i;
               break;
           }
       }
       return result;
    }
}
