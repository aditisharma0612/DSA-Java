class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans=new ListNode(0,head);
        ListNode dummy=ans;

        for(int i=0;i<n;i++){
            head=head.next;
            
        }
        while(head!=null){
            head=head.next;
            dummy=dummy.next;
        }
        dummy.next=dummy.next.next;
        return ans.next;
        
    }
}
