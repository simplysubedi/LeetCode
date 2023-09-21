import java.util.ArrayList;
import java.util.List;

public class FindTheWinner {
    public static void main(String[] args){
    int n = 5;
    int k =  2;
        System.out.println("The winner of the game is: "+findTheWinner(k , n));

    }

    private static int findTheWinner(int k, int n) {
        List<Integer> allFriends = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            allFriends.add(i);
        }
        int index = 0;
        while(allFriends.size()> 1){
            index = (index  + k -  1 )%allFriends.size();
            allFriends.remove(index);
        }
        return allFriends.get(0);
    }
}
