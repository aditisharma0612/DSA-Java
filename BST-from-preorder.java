class Solution {
    public TreeNode pre(TreeNode root, int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(root.val>val){
            root.left=pre(root.left,val);

        }
        else{
            root.right=pre(root.right,val);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=pre(null,preorder[0]);
        for(int i=1 ;i <preorder.length ;i++){
            pre(root,preorder[i]);
        }
        return root;
        
    }
}
