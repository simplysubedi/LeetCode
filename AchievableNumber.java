public class AchievableNumber {
    public static int maxAchievableNumber(int num, int t) {
        return num + (2*t);
    }

    public static void main(String[] args) {
        int num = 10;
        int t = 4;
        int result = maxAchievableNumber(num, t);
        System.out.println("Maximum achievable number: " + result);
    }

}
