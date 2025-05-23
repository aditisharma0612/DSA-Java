class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        class Solution {

         if (!p && !q) {
            return true;
        }
        
         if (p && q && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        
        return false;        
    }
};
        
