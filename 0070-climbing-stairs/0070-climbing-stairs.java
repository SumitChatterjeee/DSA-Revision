class Solution {
    public int  climb(int index,int memo[],int n){
        if(index>n)return 0;
        
        if(memo[index]!=-1)return memo[index];

        if(index==n){
            return 1;
        }

        int one=climb(index+1,memo,n);

        int two=climb(index+2,memo,n);

        memo[index]=one+two;

        return memo[index];

    }
    public int climbStairs(int n) {

        int memo[]=new int[n+1];
        Arrays.fill(memo,-1);
        return climb(0,memo,n);
    }
}