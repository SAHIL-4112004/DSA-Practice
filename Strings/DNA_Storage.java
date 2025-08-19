/**
 * Problem: DNA Storage (CodeChef)
 * Link: https://www.codechef.com/practice/course/strings/STRINGS/problems/DNASTORAGE
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            StringBuilder result = new StringBuilder();

            // Your code goes here
            for(int i=0; i<n; i+=2){
                StringBuilder sb = new StringBuilder();
                sb.append(s.charAt(i)).append(s.charAt(i+1));
                if(sb.toString().equals("00")) result.append("A");
                else if(sb.toString().equals("01")) result.append("T");
                else if(sb.toString().equals("10")) result.append("C");
                else result.append("G");
            }

            System.out.println(result.toString());
        }
    }
}