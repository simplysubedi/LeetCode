public class ReverseString {


    public static void main(String[] args) {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        reverseString(input);
        System.out.println(input); // Output: "olleh"
    }

    public static void reverseString(char[] s) {
        int left = 0;            // Pointer to the beginning of the string
        int right = s.length - 1; // Pointer to the end of the string

        while (left < right) {
            // Swap characters at the left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }}
}
