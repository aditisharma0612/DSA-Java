class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next==null)
        return head;
        ListNode mid= middleNode(head);
        ListNode leftside=sortList(head);
        ListNode rightside=sortList(mid);

        return merge(leftside,rightside);
    }

    public ListNode middleNode(ListNode head){
        ListNode slow=head, fast=head, mid;
          while(fast.next != null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
          mid=slow.next;
          slow.next=null;
          return mid;
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;

        }
        if(l1.val <= l2.val){
            l1.next=merge(l1.next,l2);
            return l1;
        }
        else {
            l2.next=merge(l1,l2.next);
            return l2;
        }
    }

        
    }
