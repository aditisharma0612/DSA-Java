class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root== null || root.val==val)
        return root;

        if(root.val > val){
            root=searchBST(root.left,val);
        
        }
        else{
            root=searchBST(root.right,val);
        }
        return root;
        
    }
}
