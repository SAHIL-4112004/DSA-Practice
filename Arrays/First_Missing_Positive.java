/**
 * Problem: First Missing Positive (LeetCode 41)
 * Link: https://leetcode.com/problems/first-missing-positive/submissions/1733952525/
 */
import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int smallest = 1;
        while(set.contains(smallest)) smallest++;

        return smallest;
    }
}
