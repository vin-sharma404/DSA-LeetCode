class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long[] degree = new long[n];
        for(int[] road: roads){
            degree[road[0]]++;
            degree[road[1]]++;
        }

        Arrays.sort(degree);
        long maxImportance=0;

        long label=1;
        for(int i=0;i<n;i++){
            maxImportance += degree[i] * label;
            label++;
        }
        return maxImportance;
    }
}