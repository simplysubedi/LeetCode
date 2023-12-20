
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromSortedList {
    public static void main(String[] args){
        List<Integer> head = new ArrayList<>();
        head.add(0);
        head.add(1);
        head.add(1);
        head.add(2);
        System.out.println("New list is: "+removeDuplicateFromList(head));
    }

    private static List<Integer> removeDuplicateFromList(List<Integer> head) {
        Set<Integer> noDuplicateList = new HashSet<>();
        for(int number: head){
            noDuplicateList.add(number);
        }
        return noDuplicateList.stream().toList();
    }
}
