public class DefangIPaddr {
    public static String defangIPAddr(String address) {
        // Use the replace method to replace "." with "[.]"
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        String address1 = "1.1.1.1";
        String address2 = "255.100.50.0";

        String defangedAddress1 = defangIPAddr(address1);
        String defangedAddress2 = defangIPAddr(address2);

        System.out.println("Input: " + address1);
        System.out.println("Output: " + defangedAddress1);

        System.out.println("Input: " + address2);
        System.out.println("Output: " + defangedAddress2);
    }
}
