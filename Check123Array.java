public class Check123Array {


    public static int is123Array(int[] a) {
        int length = a.length;

        if (length < 3) {
            return 0; //checking that minimum three elements are required
        }

        for (int i = 0; i < length - 2; i++) {
            if (a[i] == 1 && a[i + 1] == 2 && a[i + 2] == 3) {
                i += 2; // Move to the next potential triad.
            } else {
                return 0; // The sequence is not a 123 array.
            }
        }

        return 1; // The array is a 123 array.
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 3, 2, 1};
        System.out.println(is123Array(a1)); // 0

        int[] a2 = {0, 1, 2, 3, 1, 2, 3};
        System.out.println(is123Array(a2)); // 0

        int[] a3 = {1, 2, 3, 3, 2, 1, 1, 2, 3};
        System.out.println(is123Array(a3)); // 0

        int[] a4 = {1, 2, 3};
        System.out.println(is123Array(a4)); // 1

        int[] a5 = {};
        System.out.println(is123Array(a5)); // 0
    }
}
