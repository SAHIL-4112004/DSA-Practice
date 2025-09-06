/**
 * Problem: Print Adjacency List (GeeksForGeeks)
 * Link: https://www.geeksforgeeks.org/problems/print-adjacency-list-1587115620/1?page=1&category=Graph&difficulty=Easy&sortBy=submissions
 * Approach : Graph
 * Time Complexity : O(V+E)
 * Space Complexity : O(V+E)
 */

// User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0; i<V; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] e : edges){
            int u=e[0], v=e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return graph;
    }
}