/**
 * Problem: Count Pairs Whose Sum is Less than Target (leetcode 2824)
 * Link: https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/submissions/1759356316/
 * Approach : binary search
 */

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int n = nums.size();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int need = target - nums.get(i);
            // find first index where nums[j] >= need
            int j = lowerBound(nums, need);
            // all elements before j are valid, but must ensure j > i
            count += Math.max(0, j - (i + 1));
        }
        return count;
    }

    // Binary search: first index where nums[index] >= target
    private int lowerBound(List<Integer> nums, int target) {
        int low = 0, high = nums.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}