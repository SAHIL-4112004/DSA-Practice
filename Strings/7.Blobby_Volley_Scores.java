/**
 * Problem: Blobby Volley Scores (CodeChef)
 * Link: https://www.codechef.com/practice/course/strings/STRINGS/problems/BLOBBYVOLLEY
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            // your code goes here

            int alice =0;
            int bob = 0;
            char server = 'A';

            for(char winner : s.toCharArray()){
                if(winner == server){
                    if(winner == 'A') alice++;
                    else bob++;
                }
                else{
                    server = winner;
                }
            }

            System.out.println(alice+" "+bob);
        }
    }
}
