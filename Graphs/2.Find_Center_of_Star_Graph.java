/**
 * Problem: Find Center of Star Graph (leetcode 1791)
 * Link: https://leetcode.com/problems/find-center-of-star-graph/submissions/1759284912/
 * Approach : graph
 */

class Solution {
    public int findCenter(int[][] edges) {
        int len = edges.length+1;

        int[] Degree = new int[len+1];

        for(int[] edge : edges){
            Degree[edge[0]]++;
            Degree[edge[1]]++;
        }

        for(int i=1; i<=len; i++){
            if(Degree[i]==len-1) return i;
        }

        return -1;
    }
}