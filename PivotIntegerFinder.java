public class PivotIntegerFinder {
    public static int findPivot(int n) {
        long totalSum = (long) n * (n + 1) / 2;

        long leftSum = 0;
        for (int x = 1; x <= n; x++) {
            long rightSum = totalSum - leftSum - x;

            if (leftSum == rightSum) {
                return x;
            }

            leftSum += x;
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 10; // Replace this with the positive integer you want to test
        int pivot = findPivot(n);

        if (pivot != -1) {
            System.out.println("Pivot integer x: " + pivot);
        } else {
            System.out.println("No pivot integer found.");
        }
    }
}
