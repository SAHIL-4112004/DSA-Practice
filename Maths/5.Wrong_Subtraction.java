/**
 * Problem: Wrong Subtraction (CodeForces 977A)
 * Link: https://codeforces.com/problemset/problem/977/A
 * Approach : Math
 */

import java.util.*;
public class Main {
    public static void main(Stringl] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc. nextInt@;
        int k = sc.nextInt();
        while (k-- >0){
            if (n%10 == 0) {
                n = n / 10;
            }else{
                n = n-1;
            }
        }
        System.out.println(n);
    }
}