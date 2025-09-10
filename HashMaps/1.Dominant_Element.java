
/**
 * Problem: Dominant Element (CodeChef)
 * Link: https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/DOMINANT2?tab=statement
 * Approach : HashMap
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                int n = sc.nextInt();
                map.put(n, map.getOrDefault(n, 0) + 1);
            }

            int max = Integer.MIN_VALUE;
            for (int freq : map.values()) {
                if (freq > max) max = freq;
            }

            int countMax = 0;
            for (int freq : map.values()) {
                if (freq == max) countMax++;
            }

            if (countMax == 1) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();

    }
}
