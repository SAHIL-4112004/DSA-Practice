/**
 * Problem: Devu And Friendship Testing (CodeChef)
 * Link: https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/CFRTEST?tab=statement
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
            int n = sc.nextInt();

            Set<Integer> set = new HashSet<>();
            for(int i=0 ; i<n; i++){
                set.add(sc.nextInt());
            }

            System.out.println(set.size());
        }

    }
}

