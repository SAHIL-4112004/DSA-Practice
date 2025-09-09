/**
 * Problem: Equal Elements (CodeChef)
 * Link: https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/EQUALELE
 * Approach : Math
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

        while(T-- >0){
            int N = sc.nextInt();
            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < N; i++) {
                int val = sc.nextInt();
                freq.put(val, freq.getOrDefault(val, 0) + 1);
            }

            int maxFreq = 0;
            for (int f : freq.values()) {
                maxFreq = Math.max(maxFreq, f);
            }

            // Minimum operations = N - maxFreq
            System.out.println(N - maxFreq);
        }
    }
}
