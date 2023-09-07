public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode preHead = new ListNode();
        preHead.next = head;

        ListNode leftNode = head;
        ListNode preLeftNode = null;
        int counter = 1;
        while (counter != left){
            preLeftNode = leftNode;
            leftNode = leftNode.next;
            counter++;
        }
        int n = right - left + 1;
        ListNode previous = null;
        ListNode current = leftNode;
        ListNode next = null;

        ListNode nodeToSaveTheLinkToTail = null;
        while (n != 0){
            nodeToSaveTheLinkToTail = current.next;
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            n--;
        }
        if(preLeftNode != null) {
            preLeftNode.next = previous;
        }else preHead.next = previous;

        while (previous.next != null){
            previous = previous.next;
        }
        previous.next = nodeToSaveTheLinkToTail;


        return preHead.next;

   }
}
