/*
 * Problem: 1926A - Vlad and the Best of Five
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1926/A
 *
 * Summary:
 * Given a string of length 5 containing only 'A' and 'B',
 * determine which character appears more frequently.
 *
 * Input:
 * - Number of test cases (t).
 * - A string of length 5 for each test case.
 *
 * Output:
 * - Print 'A' if it appears more frequently.
 * - Otherwise, print 'B'.
 *
 * Approach:
 * 1. Initialize two counters, a and b, to count occurrences
 *    of 'A' and 'B', respectively.
 * 2. Traverse the string and increment the corresponding counter.
 * 3. Compare both counters:
 *    - If a > b, print "A".
 *    - Otherwise, print "B".
 *
 * Time Complexity: O(1) per test case (string length is fixed at 5).
 * Space Complexity: O(1) auxiliary space.
 */

package rating800;

import java.util.Scanner;

public class CF1926A_VladAndTheBestOfFive {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int a = 0, b = 0;
            String s = obj.next();
            for(int i = 0; i < 5; i++) {
                if(s.charAt(i) == 'A')  a++;
                else b++;
            }
            System.out.println((a > b) ? "A" : "B");
        }
    }
}