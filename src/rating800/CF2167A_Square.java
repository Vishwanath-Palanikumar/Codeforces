/*
 * Problem: 2167A - Square?
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/2167/A
 *
 * Summary:
 * Given four sticks, determine whether they can form a square
 * without breaking or bending any stick.
 *
 * Input:
 * - Number of test cases (t).
 * - Four stick lengths for each test case.
 *
 * Output:
 * - Print "YES" if all four sticks have equal lengths.
 * - Otherwise, print "NO".
 *
 * Approach:
 * 1. Read the length of the first stick and store it in 'first'.
 * 2. Initialize a boolean variable 'same' to true.
 * 3. Read the remaining three stick lengths and compare each
 *    with the first stick's length.
 * 4. If any length differs, set 'same' to false.
 * 5. Print "YES" if all four lengths are equal; otherwise, print "NO".
 *
 * Time Complexity: O(1) per test case (exactly four sticks).
 * Space Complexity: O(1) auxiliary space.
 */

package rating800;

import java.util.Scanner;

public class CF2167A_Square {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            boolean same = true;

            int first = obj.nextInt();
            for(int i = 1; i < 4; i++) {
                int num = obj.nextInt();
                if(num != first)
                    same = false;
            }

            System.out.println((same) ? "YES" : "NO");
        }

        obj.close();
    }
}
