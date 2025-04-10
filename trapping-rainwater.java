class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftHeight=height[left];
        int rightHeight=height[right];
        int ans=0;

        while(left<right){
            if(leftHeight < rightHeight ){
                left++;
                leftHeight=Math.max(leftHeight,height[left]);
                ans+=leftHeight-height[left];
            }
            else{
                right--;
                rightHeight=Math.max(rightHeight,height[right]);
                ans+=rightHeight-height[right];
            }
        }
        return ans;
        
    }
}
