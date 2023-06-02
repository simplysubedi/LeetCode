import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(){}[][][]";
        System.out.println("String contains Valid Parenthesis : " + isValid(s));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> characterCheck = new HashMap<>();
        Stack<Character> validCheck = new Stack<>();
        characterCheck.put('[', ']');
        characterCheck.put('{', '}');
        characterCheck.put('(', ')');
        if (s.length() % 2 != 0 || s.charAt(0) == ']' || s.charAt(0) == '}' || s.charAt(0) == ')') return false;



        for (int i = 0; i < s.length(); i++) {
            if (validCheck.isEmpty()) {
                validCheck.push(s.charAt(i));
            } else if (characterCheck.getOrDefault(validCheck.peek(), '0').equals(s.charAt(i))) {
                validCheck.pop();

            } else {
                validCheck.push(s.charAt(i));
            }

        }
        return validCheck.isEmpty();
    }

}
