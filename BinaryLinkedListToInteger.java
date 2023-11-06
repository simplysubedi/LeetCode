public class BinaryLinkedListToInteger {
    public static void main(String []args){
        BinaryLinkedListToInteger converter = new BinaryLinkedListToInteger();
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        System.out.println("Decimal value: " + converter.getDecimalValue(head)); // Output: 5

    }
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
}}
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
