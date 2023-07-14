public class Max69Number
{
    public static void main(String[] args){
        int num = 6969696;
        System.out.println("Max number after changing one 6 to 9 is: "+maximum69Number(num));
    }

    private static int maximum69Number(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }
}
