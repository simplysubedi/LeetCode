import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args ){
        int leftNum = 8;
        int rightNum = 50;
        System.out.println("Self dividing numbers in the range are: "+ selfDividingNumbers(leftNum,rightNum).toString());
    }

    private static List<Integer> selfDividingNumbers(int leftNum, int rightNum) {
        List<Integer> selfDividingNumbers = new ArrayList<>();
        for(int i = leftNum; i <= rightNum; i++){
            if(selfDivide(i)){
                selfDividingNumbers.add(i);
            }
        }
        return selfDividingNumbers;
    }

    private static boolean selfDivide(int i) {
        int temp = i;
        int digit;
        while(temp > 0){
            digit = temp % 10;
            if(digit == 0){
                return false;
            }
            if(i % digit != 0){
                return false;
            }
              temp =temp/10;
        }

        return true;
    }
}
