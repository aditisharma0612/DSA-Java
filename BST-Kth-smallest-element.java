class Solution {
    int ans=Integer.MAX_VALUE;
    int count=1;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        kthSmallest(root.left,k);
        if(count==k){
            ans=root.val;
        }
        count++;
        kthSmallest(root.right,k);
        return ans;
    }
}
