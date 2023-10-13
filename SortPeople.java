import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class SortPeople {



    public static String[] sortNamesByHeight(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        int index = 0;
        for (int key : map.keySet()) {
            names[index] = map.get(key);
            index++;
        }

        return names;

    }

        public static void main(String[] args) {
            String[] names1 = {"Mary", "John", "Emma"};
            int[] heights1 = {180, 165, 170};
            String[] result1 = sortNamesByHeight(names1, heights1);
            System.out.println(Arrays.toString(result1));

            String[] names2 = {"Alice", "Bob", "Bob"};
            int[] heights2 = {155, 185, 150};
            String[] result2 = sortNamesByHeight(names2, heights2);
            System.out.println(Arrays.toString(result2));
        }
}
