public class FourOperationsLanguage {

    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                X++;
            } else if (operation.equals("--X") || operation.equals("X--")) {
                X--;
            }
        }
        return X;
    }

    public static void main(String[] args) {
        String[] operations = {"++X", "--X", "X++", "X--"};
        int finalValue = finalValueAfterOperations(operations);
        System.out.println("The final value of X is: " + finalValue);
    }
}
