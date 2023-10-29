public class StringHalvesAreAlike {


    public boolean halvesAreAlike(String s) {
        int length = s.length();
        String a = s.substring(0, length / 2);
        String b = s.substring(length / 2, length);

        int countA = countVowels(a);
        int countB = countVowels(b);

        return countA == countB;
    }

    private int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StringHalvesAreAlike solution = new StringHalvesAreAlike();
        String s = "AbCdEfGh";
        System.out.println(solution.halvesAreAlike(s));
    }
}
