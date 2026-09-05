class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n];
        Arrays.fill(arr,Integer.MAX_VALUE);
        int min=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            arr[i]=Math.min(arr[i],min);
        }
        int max=Integer.MIN_VALUE;
        int ans=n;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            if((max-arr[i])<=k){
                ans=Math.min(ans,i);
            }
        }
        return ans==n?-1:ans;
    }
}