public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head==null)
            return head;
        if (head.next==null)
            return head;
        ListNode a=new ListNode();
        ListNode b=new ListNode();
        a=head.next.next;
        b=head.next;
        b.next=head;
        head.next=a;
        while (head.next!=null &&head.next.next!=null)
        {
            ListNode temp1=head.next;
            ListNode temp2=head.next.next;
            temp1.next=temp2.next;
            temp2.next=temp1;
            head.next=temp2;
            head=head.next.next;
        }
        return b;
    }
}
