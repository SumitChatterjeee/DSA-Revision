class Solution {
    int dx[]={-1,0,1,0};
    int dy[]={0,1,0,-1};

    public boolean isValid(int r,int c,int n,int m){
        return r>=0&&r<n&&c>=0&&c<m;
    }
    public void dfs(int r,int c,char mat[][],boolean visit[][]){
        visit[r][c]=true;

        for(int d=0;d<4;d++){
            int nrow=r+dx[d];
            int ncol=c+dy[d];
            if(isValid(nrow,ncol,mat.length,mat[0].length)){
                if(mat[nrow][ncol]=='1'&&visit[nrow][ncol]==false){
                    dfs(nrow,ncol,mat,visit);
                }
            }

        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean visit[][]=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visit[i][j]==false&&grid[i][j]=='1'){
                    count++;
                    dfs(i,j,grid,visit);
                }
            }
        }
       return count; 
    }
}