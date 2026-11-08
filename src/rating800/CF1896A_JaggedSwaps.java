/**
 * Problem:  jagged Swaps
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1896/A
 *
 * Summary:
 * Determine whether a permutation can be sorted using
 * the allowed adjacent swap operation.
 *
 * Approach:
 * The first element can never be modified because the
 * operation only swaps elements at positions i and i+1,
 * where i >= 2 (1-based indexing).
 *
 * Therefore, sorting is possible if and only if the
 * first element is already 1.
 *
 * Time Complexity: O(n) per test case (input reading)
 * Space Complexity: O(1)
 */

package rating800;

import java.util.*;

public class CF1896A_JaggedSwaps {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-- > 0) {
            int n = obj.nextInt();
            int first = obj.nextInt();
            for(int i = 1; i < n; i++) {
                int num = obj.nextInt();
            }
            System.out.println((first == 1) ? "YES" : "NO");
        }

        obj.close();
    }
}