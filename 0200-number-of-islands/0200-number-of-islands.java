class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    c++;
                    mark(grid,i,j,n,m);
                }
            }
        }
        return c;
    }
    void mark(char grid[][],int i,int j,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m)
        return;
        if(grid[i][j]=='0')
        return;
        grid[i][j]='0';
        mark(grid,i-1,j,n,m);//up
        mark(grid,i+1,j,n,m);//down
        mark(grid,i,j-1,n,m);//left
        mark(grid,i,j+1,n,m);//right
    }
}