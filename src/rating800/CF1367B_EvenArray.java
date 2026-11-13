/**
 * Problem: 1367B - Even Array
 * Rating: 800
 * Platform: Codeforces
 * Link: https://codeforces.com/problemset/problem/1367/B
 *
 * Problem Summary:
 * Given an array of non-negative integers, make it good by swapping
 * elements so that the parity of each index matches the parity of
 * the element at that index.
 *
 * Input:
 * - First line contains t, the number of test cases.
 * - Each test case contains n, the size of the array.
 * - The next line contains n integers representing the array.
 *
 * Output:
 * - Print the minimum number of swaps required to make the array good.
 * - Print -1 if it is impossible.
 *
 * Approach:
 * - Traverse the array and compare the parity of each element with
 *   the parity of its index.
 * - Count odd elements at even indices using the odd counter.
 * - Count even elements at odd indices using the even counter.
 * - Each swap fixes one mismatch of each type.
 * - If both mismatch counts are equal, print that count as the
 *   minimum number of swaps.
 * - Otherwise, print -1 because a valid arrangement is impossible.
 *
 * Time Complexity: O(n) per test case.
 * Space Complexity: O(1) auxiliary space.
 */

package rating800;

import java.util.Scanner;

public class CF1367B_EvenArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int n = obj.nextInt();
            int odd = 0, even = 0;

            for(int i = 0; i < n; i++) {
                int a = obj.nextInt();
                if((a % 2) != (i % 2)) {
                    if (a % 2 == 0)
                        even++;
                    else
                        odd++;
                }
            }

            System.out.println((odd == even) ? odd : -1);
        }

        obj.close();
    }
}
