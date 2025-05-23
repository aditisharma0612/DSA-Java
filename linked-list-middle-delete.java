class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return null;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
