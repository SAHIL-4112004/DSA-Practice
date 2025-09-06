/**
 * Problem: Chef And Dolls (CodeChef)
 * Link: https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/MISSP
 * Approach : Maths
 * Time Complexity : O(n)
 * Space Complexity : O(1)
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
            int ans = 0;

            for(int i=0; i<N; i++){
                int type = sc.nextInt();
                ans ^= type;
            }

            System.out.println(ans);
        }
    }
}
