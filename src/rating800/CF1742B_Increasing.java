/*
 * Problem: 1742B - Increasing
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1742/B
 *
 * Summary:
 * Given an array of positive integers, determine whether its
 * elements can be rearranged into strictly increasing order.
 *
 * Input:
 * - Number of test cases (t).
 * - Number of elements (n) for each test case.
 * - n positive integers representing the array elements.
 *
 * Output:
 * - Print "YES" if the array can be rearranged into
 *   strictly increasing order.
 * - Otherwise, print "NO".
 *
 * Approach:
 * 1. An array can be rearranged into strictly increasing
 *    order if and only if all its elements are distinct.
 * 2. Initialize a HashSet to store unique elements.
 * 3. Read and insert all n elements into the HashSet.
 * 4. Since a HashSet does not allow duplicate elements,
 *    its size represents the number of distinct elements.
 * 5. If set.size() == n, print "YES".
 * 6. Otherwise, duplicate elements exist, so print "NO".
 *
 * Time Complexity: O(n) on average per test case.
 * Space Complexity: O(n) auxiliary space.
 */

package rating800;

import java.util.*;

public class CF1742B_Increasing {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int n = obj.nextInt();
            Set<Integer> set = new HashSet<>();

            for(int i = 0; i < n; i++) {
                set.add(obj.nextInt());
            }

            System.out.println((set.size() == n) ? "YES" : "NO");
        }

        obj.close();
    }
}
