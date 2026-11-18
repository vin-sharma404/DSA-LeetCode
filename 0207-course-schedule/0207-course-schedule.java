
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // Step 1: Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        // Step 2: Calculate indegree
        int[] indegree = new int[numCourses];

        for(int[] p : prerequisites){
            int course = p[0];
            int pre = p[1];
            adj.get(pre).add(course);
            indegree[course]++;
        }

        // Step 3: Add nodes with indegree 0
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        // Step 4: BFS
        int count = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            for(int neighbor : adj.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor] == 0){
                    q.add(neighbor);
                }
            }
        }
        // Step 5: Check all courses processed
        return count == numCourses;
    }
}
