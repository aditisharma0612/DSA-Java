class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> intersect=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                intersect.add(nums1[i]);
                i++;
                j++;
            }
    }
    
    int [] ans=new int[intersect.size()];
    for(int k=0;k<intersect.size();k++){
        ans[k]=intersect.get(k);
    }     
    return ans;   
    }
}
