/**
 * Problem: 1374A - Required Remainder
 * Rating: 800
 * Platform: Codeforces
 * Link: https://codeforces.com/problemset/problem/1374/A
 *
 * Problem Summary:
 * Given three integers x, y and n, find the maximum integer k
 * such that 0 <= k <= n and k % x == y.
 *
 * Input:
 * - First line contains t, the number of test cases.
 * - Each test case contains three integers: x, y and n.
 *
 * Output:
 * - Print the maximum valid integer k for each test case.
 *
 * Approach:
 * - Every valid number can be represented as k = q*x + y.
 * - To find the largest valid number not exceeding n, calculate
 *   how much n exceeds the required remainder y.
 * - Subtract the remainder of (n - y) divided by x from n.
 *
 * Formula:
 * - ans = n - ((n - y) % x)
 *
 * Time Complexity: O(1) per test case.
 * Space Complexity: O(1) auxiliary space.
 */

package rating800;

import java.util.Scanner;

public class CF1374_RequiredRemainder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int x = obj.nextInt();
            int y = obj.nextInt();
            int n = obj.nextInt();

            int ans = n - ((n - y) % x);

            System.out.println(ans);
        }
    }
}
