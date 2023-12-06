public class GoalParser {
    public static void main(String args[]){
        String command = "G()()()()(al)";
        System.out.println("The parsed information is :"+interpret(command));
    }

    private static String interpret(String command) {
        String result = "";
        for (int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                result +=command.charAt(i);
            }
            else if(command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                result += 'o';
                i++;
            }
            else if(command.charAt(i) == '(' && command.charAt(i +1) == 'a'){
                result +="al";
                i = i + 3;
            }
        }
        return  result;
    }
}
