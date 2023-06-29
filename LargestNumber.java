import java.util.Arrays;
import java.util.Comparator;
public class LargestNumber {
    public static void main(String [] args){
        int [] nums = {3,30,34,5,9};
        System.out.println("The maximum number formed is: "+ largestNumber( nums));
    }


    private static String largestNumber(int[] nums) {
        // Convert numbers to strings
        String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = String.valueOf(nums[i]);
        }

        // Custom sorting comparator
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        };

        // Sort the strings using the custom sorting comparator
        Arrays.sort(numStrings, customComparator);

        // Join the sorted strings
        StringBuilder largestNum = new StringBuilder();
        for (String numString : numStrings) {
            largestNum.append(numString);
        }

        // Handle the case where the input is all zeros
        if (largestNum.charAt(0) == '0') {
            return "0";
        }

        return largestNum.toString();
    }
}