import java.util.ArrayList;
import java.util.List;

public class MergeSortedList {
    public static void main (String []args){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(9);
        list2.add(0);
        list2.add(3);
        list2.add(10);

        System.out.println("New sorted list is: "+mergeSortedList(list1, list2));
    }

    private static List<Integer> mergeSortedList(List<Integer> list1, List<Integer> list2) {
        List<Integer> resultList = new ArrayList<>();
        int index1 = 0, index2 = 0;
        while (index1 < list1.size() && index2 < list2.size()) {
            if (list1.get(index1) < list2.get(index2)) {
                resultList.add(list1.get(index1));
                index1++;
            } else {
                resultList.add(list2.get(index2));
                index2++;
            }
        }

        while (index1 < list1.size()) {
            resultList.add(list1.get(index1));
            index1++;
        }

        while (index2 < list2.size()) {
            resultList.add(list2.get(index2));
            index2++;
        }
        return resultList;
    }
}
