import javax.swing.*;

public class SubtractProductSumofDigitsInteger {
    public static void main(String[] args){
        int num = 234;
        System.out.println("The difference of product and sum of digits is : "+subtractProductAndSum(num));
    }

    private static int subtractProductAndSum(int num) {
        int temp = num;
        int sum = 0;
        int product = 1;

        while(temp > 0){
            sum += temp %10;
            product *= temp%10;
            temp = temp/10;
        }
        System.out.println(sum);
        System.out.println(product);
        return product - sum;
    }

}
