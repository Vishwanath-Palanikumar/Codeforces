/**
 * Problem: 1343B - Balanced Array
 * Rating: 800
 * Platform: Codeforces
 * Link: https://codeforces.com/problemset/problem/1343/B
 *
 * Problem Summary:
 * Construct an array of length n such that:
 * - The first n/2 elements are even.
 * - The last n/2 elements are odd.
 * - All elements are distinct and positive.
 * - The sum of the first half equals the sum of the second half.
 *
 * Input:
 * - First line contains t, the number of test cases.
 * - Each test case contains an even integer n.
 *
 * Output:
 * - Print "NO" if a balanced array cannot be constructed.
 * - Otherwise, print "YES" followed by a valid array.
 *
 * Approach:
 * - Let half = n/2.
 * - A valid array exists only when half is even.
 * - If half is odd, print "NO".
 * - Otherwise, construct the first half using consecutive even
 *   numbers: 2, 4, 6, ..., 2*half.
 * - Construct the first half-1 odd numbers as:
 *   1, 3, 5, ..., 2*(half-1)-1.
 * - Calculate the final odd number as 3*half - 1
 *   so that the sum of both halves becomes equal.
 *
 * Time Complexity: O(n) per test case.
 * Space Complexity: O(1) auxiliary space.
 */

package rating800;

import java.util.Scanner;

public class CF1343B_BalancedArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int n = obj.nextInt();
            int half = n / 2;

            if(half % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                for(int i = 1; i <= half; i++) {
                    System.out.print(2 * i + " ");
                }
                for(int i = 1; i < half; i++) {
                    System.out.print(2 * i - 1 + " ");
                }
                System.out.println(3 * half - 1);
            }
        }

        obj.close();
    }
}