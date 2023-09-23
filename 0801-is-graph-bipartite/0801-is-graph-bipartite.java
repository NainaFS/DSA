class Solution {
    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        int[] color = new int[v];
        for(int i=0; i<v; i++){
            color[i]=-1;
        }
        for(int i=0; i<v; i++){
            if(color[i]==-1){
                if(checkBi(graph, i, color, 1)==false){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkBi(int[][] graph, int curr, int[] color, int currcolor){
        Queue<Integer> queue =new LinkedList<>();
        queue.add(curr);
        color[curr]=currcolor;
        while(!queue.isEmpty()){
            int u = queue.remove();
            for(int v: graph[u]){
                if(color[u]==color[v]){
                    return false;
                } else if(color[v]==-1){
                    color[v]=1-color[u];
                    queue.add(v);
                }
            }
        }
        return true;
    }
}