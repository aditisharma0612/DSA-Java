class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        backtrack(ans,temp,0,s);
        return ans;
        
    }
    public void backtrack(List<List<String>>ans, List<String>temp,int index,String s){
        if(index==s.length()){

            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                temp.add(s.substring(index,i+1));
                backtrack(ans,temp,i+1,s);
                temp.remove(temp.size()-1);
                            }
        }
    }
    public boolean isPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }
}
