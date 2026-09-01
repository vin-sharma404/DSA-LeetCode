class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int totalEdges= edges.length;
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            map.put(u,map.getOrDefault(u,0)+1);
            map.put(v,map.getOrDefault(v,0)+1);

            if(map.get(u)==totalEdges){
                return u;
            }
            if(map.get(v)==totalEdges){
                return v;
            }
        }
    return -1;
    }
}