/**
 * Problem: 1881A - Don't Try to Count
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1881/A
 *
 * Summary:
 * Find the minimum number of operations required to make
 * string s appear as a substring of string x.
 *
 * Input:
 * Number of test cases t.
 * For each test case, integers n and m, followed by strings x and s.
 *
 * Output:
 * Minimum number of doubling operations required, or -1
 * if s cannot become a substring of x.
 *
 * Approach:
 * Repeatedly double string x until its length becomes at least
 * the length of s, counting the number of operations.
 *
 * Check whether s exists in x using contains().
 * If it does, print the current operation count.
 *
 * Otherwise, double x one additional time and check again.
 * If s is still not found, print -1 because further doublings
 * cannot make an otherwise impossible substring appear.
 *
 * Time Complexity: O(n * m) per test case.
 * Space Complexity: O(n * m) per test case.
 */

package rating800;

import java.util.Scanner;

public class CF1881A_DontTryToCount {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-- > 0) {
            int n = obj.nextInt();
            int m = obj.nextInt();

            String x = obj.next();
            String s = obj.next();

            int ans = 0;

            while(x.length() < m) {
                x += x;
                ans++;
            }

            if(x.contains(s)) {
                System.out.println(ans);
                continue;
            }

            x += x;
            ans++;

            if(x.contains(s))
                System.out.println(ans);
            else
                System.out.println(-1);
        }

        obj.close();
    }
}
