/**
 * Problem: Zigzag Conversion(LeetCode 6)
 * Link: https://leetcode.com/problems/zigzag-conversion/submissions/1732809786/
 */

import java.util.*;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;

        StringBuilder sb =new StringBuilder();

        for(int i=0; i<numRows; i++){
            int idx = i;
            int goingDown = 2*(numRows-1-i);
            int goingUp = 2*i;
            boolean goingSouth = true;

            while(idx < s.length()){
                sb.append(s.charAt(idx));

                if(i==0){
                    idx += goingDown;
                }
                else if(i==numRows-1){
                    idx += goingUp;
                }else{
                    if(goingSouth){
                        idx += goingDown;
                    }else{
                        idx += goingUp;
                    }
                    goingSouth = !goingSouth;
                }
            }
        }
        return sb.toString();

    }
}
