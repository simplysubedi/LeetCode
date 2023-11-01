import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ClimbingStairsINMaxWays {
    public static void main(String [] args){
        int n = 8;
        System.out.println("Max ways to climb stairs is : "+climbStairs( n));
    }
    public static int climbStairs(int n){

        HashSet<List<Integer>> sets = new HashSet<>();
        int result = 5 ;
        int flag = 2 * n;
        while(flag != 0){
            List<Integer> arrayList = new ArrayList<>();
            while(result > 0){

                int temp = (int)(Math.random() * (3 - 1 ) + 1);
                result = n - temp;
                arrayList.add(temp);
            }
            sets.add(arrayList);
            System.out.println(arrayList.toString());
            flag--;

        }
        return sets.size();
    }
}
