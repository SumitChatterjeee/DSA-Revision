class Solution {
    public boolean solve(int num,int t){
        int prod=1;
        while(num>0){
            prod*=(num%10);
            num=num/10;
        }

        return prod%t==0;
    }
    public int smallestNumber(int n, int t) {
        
        while(true){
            if(solve(n,t)){
                return n;
            }
            n=n+1;
        }
    }
}