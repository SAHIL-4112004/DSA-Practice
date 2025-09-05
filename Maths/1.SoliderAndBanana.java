/**
 * Problem: Solider And Banana (CodeForces 546A)
 * Link: https://codeforces.com/problemset/problem/546/A
 * Approach : basic maths
 * Time Complexity : O(w)
 * Space Complexity : O(1)
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // the cost of the first banana
        int n = sc.nextInt(); // initial money
        int w = sc.nextInt(); // number of banana wants

        int totalCost = 0;
        for (int i = 1; i <= w; i++) {
            totalCost += i * k;
        }

        System.out.println((totalCost - n)>0?totalCost-n:0);
    }
}