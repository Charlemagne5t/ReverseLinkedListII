import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void reverseTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int left = 2;
        int right = 4;

        head = new Solution().reverseBetween(head, left, right);

        Assert.assertEquals(1, head.val);
        Assert.assertEquals(4, head.next.val);
        Assert.assertEquals(3, head.next.next.val);
        Assert.assertEquals(2, head.next.next.next.val);
        Assert.assertEquals(5, head.next.next.next.next.val);

    }
}
