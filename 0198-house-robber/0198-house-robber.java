class Solution {
    public int solve(int index,int arr[],int dp[]){
        if(index>=arr.length){
            return 0;
        }

        if(dp[index]!=-1)return dp[index];

        int pick=arr[index]+solve(index+2,arr,dp);

        int notpick=solve(index+1,arr,dp);

        return dp[index]=Math.max(pick,notpick);
    }
    public int rob(int[] nums) {

        int dp[]=new int[nums.length+1];

        
            Arrays.fill(dp,-1);
        
        return solve(0,nums,dp);
    }
}