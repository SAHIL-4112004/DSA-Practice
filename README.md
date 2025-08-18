# DSA-Practice
# 🚀 DSA Practice Repository

Welcome to my **Data Structures & Algorithms (DSA)** practice repository!  
This repo contains my solutions to problems from platforms like **LeetCode, Codeforces, GeeksforGeeks, and InterviewBit**.  
The goal is to **track my progress, build consistency, and create a knowledge base** for future reference.

---

## 📂 Repository Structure
The problems are organized by topic for easy navigation:

- 📌 `arrays/` → Array-based problems  
- 📌 `strings/` → String manipulation problems  
- 📌 `linkedlist/` → Linked List implementations and problems  
- 📌 `stacks_queues/` → Stack & Queue problems  
- 📌 `trees/` → Binary Trees & Binary Search Trees  
- 📌 `graphs/` → BFS, DFS, and graph algorithms  
- 📌 `dynamic_programming/` → DP problems (LCS, Knapsack, etc.)  
- 📌 `sorting_searching/` → Sorting algorithms & searching techniques  
- 📌 `others/` → Miscellaneous (math, bit manipulation, etc.)  

---

## 🛠️ Languages Used
- Java (primary) ☕  
- (Possibly add C++/Python later if I solve in multiple languages)

---

## 📈 Progress Tracking
✅ Problems Solved: 9
📅 Started: *Aug 2025*  
🕒 Last Updated: *17Aug 2025*  

---

✨ Example Problem Format
Each solution file includes:
1. Problem statement (in comments)
2. Approach / Explanation
3. Code implementation

Example:
```java
/**
 * Problem: Two Sum (LeetCode 1)
 * Link: https://leetcode.com/problems/two-sum/
 * Approach: Use HashMap to store indices and check complement in O(n).
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
