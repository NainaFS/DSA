class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int row=image.length;
        int column=image[0].length;
        DFS(image,sr,sc,row,column,image[sr][sc], color);
        for(int i=0; i< row; i++){
            for(int j=0; j<column; j++){
                if(image[i][j]==-1){
                    image[i][j]=color;
                }
            }
        }
        return image;
    }

    void DFS(int[][]image, int x, int y, int r, int c, int oldColor, int newColor){
        if(x<0||y<0||x>=r||y>=c||image[x][y]!=oldColor) return;
        image[x][y]=-1;
        DFS(image,x-1,y,r,c,oldColor,newColor);
        DFS(image,x+1,y,r,c,oldColor,newColor);
        DFS(image,x,y+1,r,c,oldColor,newColor);
        DFS(image,x,y-1,r,c,oldColor,newColor);
    }
}