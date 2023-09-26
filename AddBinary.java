public class AddBinary {
    public static void main(String []args){
        String a = "11";
        String b = "11";
        System.out.println("The sum is: " +addBinary(a ,b));
    }

    private static String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);
        return Integer.toBinaryString(num1 + num2);
    }
}
