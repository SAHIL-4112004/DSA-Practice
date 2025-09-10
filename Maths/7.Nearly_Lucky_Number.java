

/**
 * Problem: Nearly Lucky Number (CodeForces 110A)
 * Link: https://codeforces.com/problemset/problem/110/A
 * Approach : Maths
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0;

        while(n>=1){
            long a = n%10;

            if(a==4 || a==7) cnt++;

            n=n/10;
        }

        if (cnt == 0) {
            System.out.println("NO");
        } else {
            boolean isLucky = true;
            int temp = cnt;
            while (temp > 0) {
                int d = temp % 10;
                if (d != 4 && d != 7) {
                    isLucky = false;
                    break;
                }
                temp /= 10;
            }
            if (isLucky) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
