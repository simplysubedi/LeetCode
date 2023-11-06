
public class MiddleOfLinkedList {
    public static void main(String []args){
        BinaryLinkedListToInteger converter = new BinaryLinkedListToInteger();
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        ListNode middleNode = head.middleNode(head);
        System.out.println("Middle Node: " + middleNode.val); // Output: 5

    }


}
