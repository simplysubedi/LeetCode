import java.util.Scanner;

public class ThirdHighest {
    public static String ArrayChallenge(String[] strArr) {
        int len = strArr.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; i!=j && j < len; j++){
                if(strArr[i].length() <= strArr[j].length()){
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }
        return strArr[len - 3];
    }

    public static void main (String[] args) {
        String[] stringArray = {"Hello", "World", "Java", "Array"};
        System.out.print(ArrayChallenge(stringArray));
    }

}
