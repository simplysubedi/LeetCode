public class EquivalentArrays {


    public static int equivalentArrays(int[] a1, int[] a2) {
        if (a1.length == 0 && a2.length == 0) {
            return 1;
        }
        if (a1.length == 0 || a2.length == 0) {
            return 0;
        }
        for (int i = 0; i < a1.length; i++) {
            boolean found = false;
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return 0;
            }
        }
        for (int i = 0; i < a2.length; i++) {
            boolean found = false;
            for (int j = 0; j < a1.length; j++) {
                if (a2[i] == a1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] a1 = {0, 1, 2};
        int[] a2 = {2, 0, 1};
        System.out.println(equivalentArrays(a1, a2)); // 1

        int[] a3 = {0, 2, 1, 2};
        int[] a4 = {3, 1, 2, 0};
        System.out.println(equivalentArrays(a3, a4)); // 0

        int[] a5 = {1, 1, 1, 1, 1, 1};
        int[] a6 = {1, 1, 1, 1, 1, 2};
        System.out.println(equivalentArrays(a5, a6)); // 0

        int[] a7 = {};
        int[] a8 = {3, 1, 1, 1, 1, 2};
        System.out.println(equivalentArrays(a7, a8)); // 0

        int[] a9 = {};
        int[] a10 = {};
        System.out.println(equivalentArrays(a9, a10)); // 1
    }
}
