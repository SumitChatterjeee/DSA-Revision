class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                min=Math.min(min,nums[j]);
            }
            if((max-min)<=k){
                ans=Math.min(ans,i);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}