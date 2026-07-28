class Solution {

    public void dfs(int node,ArrayList<ArrayList<Integer>>adj,boolean visit[]){
        visit[node]=true;

        for(Integer it:adj.get(node)){
            if(visit[it]==false){
                dfs(it,adj,visit);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        int n=isConnected.length;

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(isConnected[i][j]==1){
                        adj.get(i).add(j);
                        adj.get(j).add(i);
                    }
                }
            }
        }

        boolean visit[]=new boolean[n];

        int count=0;
        for(int i=0;i<n;i++){
            if(visit[i]==false){
                dfs(i,adj,visit);
                count++;
            }
        }
        return count;

    }
}