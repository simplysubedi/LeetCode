public class RapidlyIncreasingArray {
    public static int isRapidlyIncreasing(int[] a) {
        int sum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] <= 2 * sum) {
                return 0;
            }
            sum += a[i];
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3, 9, 27};
        System.out.println(isRapidlyIncreasing(a1)); // 1

        int[] a2 = {1, 3, 200, 500};
        System.out.println(isRapidlyIncreasing(a2)); // 1

        int[] a3 = {1};
        System.out.println(isRapidlyIncreasing(a3)); // 1

        int[] a4 = {1, 3, 9, 26};
        System.out.println(isRapidlyIncreasing(a4)); // 0

        int[] a5 = {1, 3, 7, 26};
        System.out.println(isRapidlyIncreasing(a5)); // 0

        int[] a6 = {1, 3, 8, 26};
        System.out.println(isRapidlyIncreasing(a6));
    }
}
