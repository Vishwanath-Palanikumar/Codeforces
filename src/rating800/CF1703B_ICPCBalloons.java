/*
 * Codeforces 1703B - ICPC Balloons
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1703/B
 *
 * Problem:
 * Given a string representing the order in which problems
 * are solved, calculate the total number of balloons given.
 * Each solved problem requires one balloon, and the first
 * solution to each distinct problem receives one extra balloon.
 *
 * Input:
 * t test cases. Each test case contains an integer n,
 * followed by a string of length n consisting of uppercase
 * English letters.
 *
 * Output:
 * Print the total number of balloons for each test case.
 *
 * Approach:
 * Use a HashSet to track the problems encountered.
 * For each character, add 2 to the count if it is the first
 * occurrence of that problem; otherwise, add 1.
 * Add each character to the set after processing it.
 *
 * Complexity: O(n) expected time and O(1) extra space
 * per test case, since there are at most 26 distinct letters.
 */

package rating800;

import java.util.*;

public class CF1703B_ICPCBalloons {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int n = obj.nextInt();
            String str = obj.next();
            Set<Character> set = new HashSet<>();
            int count = 0;

            for(int i = 0; i < n; i++) {
                char c = str.charAt(i);
                count += (set.contains(c) ? 1 : 2);
                set.add(c);
            }

            System.out.println(count);
        }

        obj.close();
    }
}
