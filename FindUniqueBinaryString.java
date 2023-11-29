import java.util.HashSet;
import java.util.Set;

public class FindUniqueBinaryString {
    public static void main(String []args){
        String []nums = {"00","01"};
        System.out.println("Unique string is: "+findDifferentBinaryString(nums));
}

    private static String findDifferentBinaryString(String[] nums) {
        //One of the best approach
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < nums.length; i++){
//           sb.append(nums[i].charAt(i)=='0' ?'1':'0');
//        }
//        return sb.toString();


        //Another approach
        int size = nums[0].length();
        String result = "";
        Set<String> binaryString = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
          binaryString.add(nums[i]);
        }

        for(int i = 0; i <= 17; i++){
            String binaryVal = Integer.toBinaryString(i);
           while(binaryVal.length() != size){
               binaryVal = "0" + binaryVal;
           }
           if( binaryString.add(binaryVal)){
               result =binaryVal;
               break;
           }
        }

        return result;
    }

    }
