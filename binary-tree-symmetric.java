class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isCheck(root.left,root.right);
        }
    public boolean isCheck(TreeNode node1, TreeNode node2){
        if(node1==null && node2==null){
            return true;
        }
        if(node1==null || node2==null){
            return false;
    } 
        return node1.val==node2.val && isCheck(node1.left,node2.right) && isCheck(node1.right,node2.left);
        
    }
}
