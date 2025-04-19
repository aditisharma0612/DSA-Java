class Solution{
      public int sqrt(int n){
         int low=1;
         int high=n;
         while(low<=high){
             int mid=(low+high)/2;
             int ans=mid*mid;
             if(ans<=n){
               low=mid+1;
             else{
               high=mid=1;
             }
         }
        return high;
      }
}
              
