class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    ans =Math.max(ans,DFS(grid,i,j));
                }
            }
        }
        return ans;
    }

    public int DFS(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) 
            return 0;
        grid[i][j]=0;
        return 1+ DFS(grid,i+1,j)+ DFS(grid, i-1, j) + DFS(grid,i,j+1)+ DFS(grid,i,j-1);
    }
}