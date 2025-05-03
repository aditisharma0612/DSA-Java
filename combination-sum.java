class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,new ArrayList<>() , nums, 0, target);
        return list;
    }
    private void backtrack (List<List<Integer>> list, List<Integer> temp , int nums[], int start, int remain ) {
        if (remain < 0 ) return ;
        else if (remain ==0) list.add(new ArrayList<> (temp));
        else{
            for(int i=start ;i <nums.length ;i++){
                temp.add(nums[i]);
                backtrack(list,temp,nums,i,remain-nums[i]);

                temp.remove(temp.size()-1);
            }
        }    }  
    
}
