class Solution {
    public int findMin(int[] a) {
        int l=0,r=a.length-1;
        
        
        while(l<r){
            int mid=(l+r)/2;
            if(a[mid]<a[r]){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return a[l];
    }
}
