class Solution {
    List <Integer> ls = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {

        if(root == null) return new ArrayList<>();

        inorderTraversal(root.left);
        ls.add(root.val);
        inorderTraversal(root.right);
        

        
        return ls;
    }
}
