

/**
 * Problem: ATM Machine (CodeChef)
 * Link: https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/ATM2
 * Difficulty : 1001
 * Time Complexity : O(N)
 * Space Complexity : O(N)
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
            int K = sc.nextInt();

            StringBuilder sb = new StringBuilder();


            for(int i=0; i<N; i++){
                int temp = sc.nextInt();

                if(temp <= K){
                    K = K-temp;
                    sb.append("1");
                }
                else{
                    sb.append("0");
                }
            }

            System.out.println(sb.toString());
        }
    }
}
