public class ExcelSheetColumnTitle {
    public static void main(String[] args)
    {
        int columnNumber = 701;
        System.out.println("The corresponding title number is: "+ convertToTitle(columnNumber));
    }

    private static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;  // Adjust for 1-based indexing

            int remainder = columnNumber % 26;
            sb.insert(0, (char) ('A' + remainder));
            columnNumber /= 26;
        }

        return sb.toString();
    }
}
