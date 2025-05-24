int findMaxConsecutiveOnes(vector<int>& nums) {
        
        int maxCon = INT_MIN;
        int count = 0;
        
        for(int i = 0; i < nums.size(); i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxCon = max(maxCon, count);
        }
        return maxCon;
    }
