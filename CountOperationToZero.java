public class CountOperationToZero {
    public int minOperations(int num1, int num2) {
        int count = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountOperationToZero solution = new CountOperationToZero();
        int num1 = 2;
        int num2 = 3;
        System.out.println(solution.minOperations(num1, num2));
    }
}
