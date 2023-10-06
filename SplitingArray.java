public class SplitingArray {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        int result = balancedStringSplit(s);
        System.out.println("Maximum number of balanced substrings: " + result);
}

    private static int balancedStringSplit(String s) {
        int count = 0; // To keep track of the balanced substrings count
        int balance = 0; // To keep track of the balance of 'L' and 'R' characters

        for (char c : s.toCharArray()) {
            if (c == 'L') {
                balance++;
            } else if (c == 'R') {
                balance--;
            }

            // If the balance becomes zero, it means we have a balanced substring
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
    }
