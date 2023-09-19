class Solution {
    public int uniquePathsIII(int[][] grid) {
        int sx=0, sy=0, dx=0, dy=0, count=0;
        for(int i=0; i<grid.length;i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    sx=i;
                    sy=j;
                } else if(grid[i][j]==2){
                    dx=i;
                    dy=j;
                } else if(grid[i][j]==0){
                    count++;
                }
            }
        }

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        return PathCount(grid, sx, sy, dx, dy, visited, count+1);
    }

    int PathCount(int[][] grid, int x, int y, int dx, int dy, boolean[][] visited, int count){
        if(x==dx && y==dy){
            if(count==0) return 1;
            return 0;
        }
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || visited[x][y] == true|| grid[x][y] ==-1){
            return 0;
        }
        visited[x][y]=true;
        int res = PathCount(grid, x-1, y, dx, dy, visited, count-1) +
                    PathCount(grid, x+1, y, dx, dy, visited, count-1) +
                    PathCount(grid, x, y-1, dx,dy, visited, count-1) +
                    PathCount(grid, x, y+1, dx, dy, visited, count-1);
        visited[x][y]=false;
        return res;
    }
}