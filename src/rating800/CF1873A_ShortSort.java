/*
 * Codeforces 1873A - Short Sort
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1873/A
 *
 * Problem:
 * Given a string containing the characters 'a', 'b', and 'c',
 * determine whether it can be transformed into "abc" using
 * at most one swap of two characters.
 *
 * Input:
 * t test cases, each containing a string of length 3.
 *
 * Output:
 * Print "YES" if the string can become "abc" with at most
 * one swap; otherwise, print "NO".
 *
 * Approach:
 * Count the positions that differ from "abc".
 * If the mismatch count is 0 or 2, print "YES";
 * otherwise, print "NO".
 *
 * Complexity: O(1) time and O(1) extra space per test case.
 */

package rating800;
import java.util.*;

public class CF1873A_ShortSort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            String str = obj.next();
            int count = 0;

            count += (str.charAt(0) != 'a') ? 1 : 0;
            count += (str.charAt(1) != 'b') ? 1 : 0;
            count += (str.charAt(2) != 'c') ? 1 : 0;

            System.out.println((count == 0 || count == 2) ? "YES" : "NO");
        }
    }
}
