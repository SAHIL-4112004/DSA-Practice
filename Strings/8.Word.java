/**
 * Problem: Word (CodeForces 59A)
 * Link: https://codeforces.com/problemset/problem/59/A
 * Approach : String
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)) upperCaseCount++;
            else lowerCaseCount++;
        }

        System.out.println((upperCaseCount>lowerCaseCount)?s.toUpperCase():s.toLowerCase());
    }
}