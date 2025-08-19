/**
 * Problem: Different Consecutive Character (CodeChef)
 * Link: https://www.codechef.com/practice/course/strings/STRINGS/problems/DIFFCONSEC?tab=statement
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

        int t = sc.nextInt();
// 		sc.nextLine();

        while(t-- >0){
            int count = 0;
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            for(int i=0;i<n-1;i++){
                if(s.charAt(i)==s.charAt(i+1)) count++;
                else continue;
            }
            System.out.println(count);
        }



    }
}
