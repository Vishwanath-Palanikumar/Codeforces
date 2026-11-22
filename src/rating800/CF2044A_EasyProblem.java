/*
 * Problem: 2044A - Easy Problem
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/2044/A
 *
 * Summary:
 * Given a positive integer n, determine the number of ordered
 * pairs of positive integers (a, b) such that a + b = n.
 *
 * Input:
 * - Number of test cases (t).
 * - A positive integer n for each test case.
 *
 * Output:
 * - Print the number of valid ordered pairs for each test case.
 *
 * Approach:
 * 1. Both a and b must be positive integers.
 * 2. The value of a can range from 1 to n - 1.
 * 3. For each value of a, there is exactly one valid
 *    value of b = n - a.
 * 4. Therefore, the total number of ordered pairs is n - 1.
 * 5. Print n - 1 directly without using loops.
 *
 * Time Complexity: O(1) per test case.
 * Space Complexity: O(1) auxiliary space.
 */

package rating800;

import java.util.Scanner;

public class CF2044A_EasyProblem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int n = obj.nextInt();
            System.out.println(n - 1);
        }

        obj.close();
    }
}
