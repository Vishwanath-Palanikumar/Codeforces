/**
 * Problem: 1370A - Maximum GCD
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1370/A
 *
 * Summary:
 * Find the maximum possible GCD among all pairs of distinct
 * integers selected from the range [1, n].
 *
 * Input:
 * Number of test cases t, followed by an integer n for each test case.
 *
 * Output:
 * Maximum possible GCD for each test case.
 *
 * Approach:
 * Let k be the GCD of two distinct integers.
 * Both integers must be multiples of k.
 * The smallest possible distinct multiples are k and 2k.
 *
 * Therefore, 2k <= n, which gives k <= floor(n / 2).
 * This maximum is achievable by selecting floor(n / 2)
 * and 2 * floor(n / 2).
 *
 * Hence, the answer is simply n / 2 using integer division.
 *
 * Time Complexity: O(1) per test case.
 * Space Complexity: O(1).
 */

package rating800;

import java.util.Scanner;

public class CF1370A_MaximumGCD {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int n = obj.nextInt();
            System.out.println(n / 2);
        }

        obj.close();
    }
}