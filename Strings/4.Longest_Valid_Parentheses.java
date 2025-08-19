/**
 * Problem: Longest Valid Parentheses (LeetCode 32)
 * Link: https://leetcode.com/problems/longest-valid-parentheses/submissions/1735365147/
 */

import java.util.*;

class Solution {
    public int longestValidParentheses(String s) {
        int left=0, right=0, count=0;

        //left -> right
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') left++;
            else right++;
            if(left == right) count = Math.max(count, 2*right);
            else if(right > left) right=left=0;
        }

        //right -> left
        left = right = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='(') left++;
            else right++;
            if(left == right) count = Math.max(count, 2*left);
            else if(right < left) right=left=0;
        }

        return count;
    }
}
