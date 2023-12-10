public class FaultyKeyboard {
    public static void main(String[] args){
        String str = "dghirgl";
        System.out.println("The new string is: "+finalString(str));
    }

    private static String finalString(String str) {
        String strNew ="";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'i'){
                strNew = reverse(strNew);
            }

            else {
                strNew += str.charAt(i);
            }
        }
        return strNew;
    }

    private static String reverse(String strNew) {
        String reverse = "";
        for(int i = strNew.length() - 1; i >= 0; i--){
            reverse += strNew.charAt(i);


        }
        return reverse;
    }

}
