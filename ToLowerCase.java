public class ToLowerCase {
    public static void main(String[] args) {
        String inputString = "Hello World";
        String resultString = convertUppercaseToLowercase(inputString);
        System.out.println(resultString);
    }

    public static String convertUppercaseToLowercase(String input) {
        return input.toLowerCase();
    }
}
