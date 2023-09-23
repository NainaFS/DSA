class Solution {
    
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==word.charAt(0) && DFS(board,i,j,0,word, visited)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean DFS(char[][] board, int i, int j, int index, String word, boolean[][] visited){
        if(index==word.length()) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(index) || visited[i][j]) return false;
        visited[i][j]=true;
        boolean found = DFS(board, i+1, j, index+1, word, visited)
                        || DFS(board, i-1, j, index+1, word, visited)
                        || DFS(board, i, j+1, index+1, word, visited)
                        || DFS(board, i, j-1, index+1, word, visited);
        visited[i][j]=false;
        return found;
    }
}