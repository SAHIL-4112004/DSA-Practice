/**
 * Problem: Island Perimeter (LeetCode 463)
 * Link: https://leetcode.com/problems/island-perimeter/submissions/1771870347/?envType=problem-list-v2&envId=breadth-first-search
 * Difficulty : Easy
 * Time Complexity: O(m × n)
 * Space Complexity: O(m × n)
 */

class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int perimeter = 0;

        //directions
        int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j] == 1){
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i, j});
                    visited[i][j] = true;

                    while(!q.isEmpty()){
                        int[] cell = q.poll();
                        int r=cell[0], c=cell[1];

                        for(int[] d : dirs){
                            int nr=r+d[0], nc=c+d[1];

                            if(nr<0 || nr>=rows || nc<0 || nc>=cols || grid[nr][nc]==0){
                                perimeter++;
                            }else if(!visited[nr][nc]){
                                visited[nr][nc] = true;
                                q.add(new int[]{nr, nc});
                            }
                        }
                    }

                    return perimeter;
                }
            }
        }
        return 0;
    }
}