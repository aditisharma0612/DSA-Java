class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null) q.offer(root);

        while(!q.isEmpty()){
            TreeNode list=null;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node!=null){
                    list=node;

                    if(node.left!=null) q.offer(node.left);
                    if(node.right!=null) q.offer(node.right);
                }
                
            }
            if(list!=null){
                ans.add(list.val);
            }
        }
        return ans;
        
    }
}
