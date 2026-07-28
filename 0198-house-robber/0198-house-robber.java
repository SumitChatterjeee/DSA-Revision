class Solution {
    public int solve(int index,int crrCost,int arr[],int dp[][]){
        if(index>=arr.length){
            return crrCost;
        }

        if(dp[index][crrCost]!=-1)return dp[index][crrCost];

        int pick=solve(index+2,crrCost+arr[index],arr,dp);

        int notpick=solve(index+1,crrCost,arr,dp);

        return dp[index][crrCost]=Math.max(pick,notpick);
    }
    public int rob(int[] nums) {

        int dp[][]=new int[nums.length+1][20001];

        for(int i=0;i<=nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        
        return solve(0,0,nums,dp);
    }
}