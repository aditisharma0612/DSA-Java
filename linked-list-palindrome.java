class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> li=new ArrayList();
        while(head!= null){
            li.add(head.val);
            head=head.next;
        }
        int left=0;
        int right=li.size()-1;
        while(left < right && li.get(left)== li.get(right)){
            left++;
            right--;
        }
        return left >= right;
        
    }
}
