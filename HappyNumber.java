import java.util.Arrays;
import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args){
        int num = 2;
        if(isHappy(num))
        System.out.println("The "+ num +" is a Happy number.");
        else
            System.out.println("The "+ num +" is not a Happy number.");
    }
    private static boolean isHappy(int num) {
        HashSet<Integer> allNumbers = new HashSet<>();
        while(num >= 0 && !allNumbers.contains(num)){
            allNumbers.add(num);
            if(num == 1){
                return true;
            }
        num = squareCalculator(num);
        }
        return false;
    }
    private static int squareCalculator(int num) {
        //faster Approach
//        int sum = 0;
//        while(num != 0){
//            sum += Math.pow((num % 10), 2);
//            num = num/10;
//        }
//        return sum;
//    }
        //Using Lambda
        return String.valueOf(16).chars().map(Character::getNumericValue).map(x->x*x).sum();
    }
}
