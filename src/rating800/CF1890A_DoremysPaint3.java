/**
 * Problem: 1890A - Doremy's Paint 3
 * Rating: 800
 * Platform: Codeforces
 * Link: https://codeforces.com/problemset/problem/1890/A
 *
 * Problem Summary:
 * Given an array, determine whether its elements can be rearranged
 * so that the sum of every pair of adjacent elements is equal.
 *
 * Input:
 * - First line contains t, the number of test cases.
 * - Each test case contains n, the size of the array.
 * - The next line contains n integers representing the array.
 *
 * Output:
 * - Print "YES" if a valid rearrangement exists.
 * - Otherwise, print "NO".
 *
 * Approach:
 * - Use a HashMap to store the frequency of each distinct element.
 * - If the map contains more than two distinct elements, print "NO".
 * - If it contains only one distinct element, print "YES".
 * - If it contains exactly two distinct elements, compare their frequencies.
 * - A valid arrangement exists if the absolute difference between
 *   the two frequencies is at most 1.
 *
 * Time Complexity: O(n) expected per test case.
 * Space Complexity: O(n) for the HashMap in the worst case.
 */

package rating800;

import java.util.*;

public class CF1890A_DoremysPaint3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int n = obj.nextInt();

            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < n; i++) {
                int a = obj.nextInt();
                map.put(a, map.getOrDefault(a, 0) + 1);
            }

            if(map.size() > 2) {
                System.out.println("NO");
            } else if(map.size() == 1) {
                System.out.println("YES");
            } else {
                int[] freq = map.values().stream().mapToInt(Integer::intValue).toArray();
                System.out.println((Math.abs(freq[0] - freq[1]) <= 1) ? "YES" : "NO");
            }
        }

        obj.close();
    }
}