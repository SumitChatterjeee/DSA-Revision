class Solution {

    public void dfs(int node,ArrayList<ArrayList<Integer>>adj,boolean visit[]){
        visit[node]=true;

        for(Integer it:adj.get(node)){
            if(!visit[it]){
                dfs(it,adj,visit);
            }
        }
    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] inv:invocations){
            int u=inv[0];
            int v=inv[1];
            adj.get(u).add(v);
        }

        boolean visit[]=new boolean[n];
        dfs(k,adj,visit);
        List<Integer>ans=new ArrayList<>();
        for(int[] inv:invocations){
            int u=inv[0];
            int v=inv[1];
           if(visit[u]==false&&visit[v]==true){
                for(int i=0;i<n;i++){
                    ans.add(i);
                    
                }
                return ans;
           }
        }

        for(int i=0;i<n;i++){
            if(!visit[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}