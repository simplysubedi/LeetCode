import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedList {
    public static void main(String []args){
    List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(1);
        list2.add(4);

        System.out.println("Sorted List is : "+    mergeTwoLists( list1, list2));
}

    private static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
    }
