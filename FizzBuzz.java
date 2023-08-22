import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] agrs){
        int num = 58;
        System.out.println(fizzBuzz(num));
    }


        public static List<String> fizzBuzz(int n) {
            List<String> answer = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    answer.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    answer.add("Fizz");
                } else if (i % 5 == 0) {
                    answer.add("Buzz");
                } else {
                    answer.add(Integer.toString(i));
                }
            }
            return answer;
    }
}
