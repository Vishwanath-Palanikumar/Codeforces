/*
 * Codeforces 1367A - Short Substrings
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1367/A
 *
 * Problem:
 * Given an encoded string b formed by concatenating all
 * substrings of length 2 from an original string a,
 * reconstruct the original string a.
 *
 * Input:
 * t test cases, each containing an encoded string b.
 *
 * Output:
 * Print the original string a for each test case.
 *
 * Approach:
 * Append the first character of b to a StringBuilder.
 * Then append characters at odd indices (1, 3, 5, ...)
 * before the last index. Finally, append the last character
 * of b to complete the original string.
 *
 * Complexity: O(n) time and O(n) extra space per test case,
 * where n is the length of the encoded string.
 */

package rating800;

import java.util.Scanner;

public class CF1367A_ShortSubstrings {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            String str = obj.next();
            int n = str.length();

            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0));
            for(int i = 1; i < n - 1; i += 2) {
                sb.append(str.charAt(i));
            }
            sb.append(str.charAt(n - 1));

            System.out.println(sb.toString());
        }
    }
}
