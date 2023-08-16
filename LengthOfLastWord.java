public class LengthOfLastWord {
    public static void main(String[] args){
        String words = "sflisd   ";
        System.out.println("The length of last word is: "+lengthOfLastWord(words));
    }

    private static int lengthOfLastWord(String s1) {
        String s = s1.strip();
        int len =0;
        int index = s.length()-1;
        while(s.charAt(index) != ' '){
            len++;
            if(index == 0)
                break;
            index--;
        }
        return len;
    }
}
