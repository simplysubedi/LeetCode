import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args){
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = numJewelsInStones(jewels, stones);
        System.out.println("Number of jewels in stones: " + result);
    }

    private static int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }

        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (jewelSet.contains(stone)) {
                count++;
            }
        }

        return count;

    }
}
