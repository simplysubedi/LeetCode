public class PanagramInput {
    public static void main(String[] args){
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Panagram Sentence :"+ checkIfPangram(sentence1));
    }


    public static boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }
        for (boolean seen : alphabet) {
            if (!seen) {
                return false;
            }
        }

        return true;
    }
}
