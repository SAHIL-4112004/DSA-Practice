/**
 * Problem: Shortest Path From 1 to N (GeeksForGeeks)
 * Link: https://www.geeksforgeeks.org/problems/shortest-path-from-1-to-n0156/1?page=1&category=Graph&difficulty=Easy&sortBy=submissions
 * Approach : Math
 */

class Solution {
    public int minStep(int n) {
        // code here
        int steps = 0;
        while (n > 1) {
            if (n % 3 == 0) n /= 3;
            else n -= 1;
            steps++;
        }
        return steps;
    }
}
