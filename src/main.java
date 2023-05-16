public class main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode swappedList = solution.swapPairs(head);
        // Output: 2 -> 1 -> 4 -> 3
    }
}
