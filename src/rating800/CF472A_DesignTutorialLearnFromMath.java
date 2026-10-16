/*
 * Codeforces 472A - Design Tutorial: Learn from Math
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/472/A
 *
 * Problem:
 * Given an integer n (n >= 12), express it as the sum of
 * two composite numbers.
 *
 * Input:
 * A single integer n.
 *
 * Output:
 * Print two composite integers x and y such that x + y = n.
 *
 * Approach:
 * If n is even, print 4 and n - 4.
 * If n is odd, print 9 and n - 9.
 * Since n >= 12, both numbers in either case are composite,
 * and their sum is n.
 *
 * Complexity: O(1) time and O(1) extra space.
 */

package rating800;

import java.util.Scanner;

public class CF472A_DesignTutorialLearnFromMath {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();

        System.out.println((n % 2 == 0)
                ? 4 + " " + (n - 4)
                : 9 + " " + (n - 9));
    }
}
