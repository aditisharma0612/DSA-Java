class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;

        Arrays.sort(nums);
        int max=1,current=1;

        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]==nums[i-1]+1){
                current++;
                max=Math.max(max,current);
            }
            else current=1;
        }
        return max;
    }
}
