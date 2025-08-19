/**
 * Problem: World Chess Championship (CodeChef)
 * Link: https://www.codechef.com/practice/course/strings/STRINGS/problems/WCC?tab=statement
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class World_Chess_Championship
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        while(T-- >0){
            int X = sc.nextInt();
            sc.nextLine();
            int Carlsen = 0;
            int Chef = 0;
            int Draw = 0;

            String S = sc.nextLine();
            for(char c : S.toCharArray()){
                if( c == 'C') Carlsen+=2;
                else if(c == 'N') Chef+=2;
                else{
                    Carlsen++;
                    Chef++;
                }
            }

            if(Carlsen>Chef ) System.out.println(X*60);
            else if(Carlsen<Chef) System.out.println(X*40);
            else System.out.println(X*55);

        }

    }
}
