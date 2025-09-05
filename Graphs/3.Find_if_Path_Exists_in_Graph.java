/**
 * Problem: Find if Path Exists in Graph (leetcode 1971)
 * Link: https://leetcode.com/problems/find-if-path-exists-in-graph/submissions/1760685871/?envType=problem-list-v2&envId=graph
 * Approach : 1) Build an adjacency list: for each undirected edge (u, v), add v to u’s neighbors and u to v’s.
              2) Use a queue (BFS) or stack/recursion (DFS) and a visited set to avoid revisiting nodes.
              3) Push start. While the structure is not empty:
                    Pop a node x. If x == end → return true.
                    Otherwise add each neighbor of x that isn’t visited to the queue/stack and mark visited.
              4) If you exhaust the structure and never saw end, return false.
 * Time Complexity : O(n+m)
 * Space Complexity : O(n+m)
 */

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //edgecase
        if(source == destination) return true;

        //step1: build adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] e : edges){
            int u = e[0], v = e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }


        //step2 : BFS
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        visited[source] = true;
        q.add(source);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(curr == destination) return true;

            for(int neigh : graph.get(curr)){
                if(!visited[neigh]){
                    visited[neigh] = true;
                    q.add(neigh);
                }
            }
        }

        return false;
    }
}