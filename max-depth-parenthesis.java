class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int opened=0;

        for(int i=0; i < s.length() ;i++){
            if(s.charAt(i)=='(') {
                opened++;
                }
            else if(s.charAt(i)==')') {
                opened--; 
                }
            
            
            ans=Math.max(ans,opened);
            }
            return ans;
        }
        
    
}
