/**
 * Problem: 1722A - Spell Check
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1722/A
 *
 * Summary:
 * Determine whether a string can be rearranged to form "Timur".
 *
 * Approach:
 * Check that the string length is 5, then compare the character
 * frequencies against the letters in "Timur".
 *
 * Time Complexity: O(1) per test case
 * Space Complexity: O(1)
 */

package rating800;

import java.util.Scanner;

public class CF1722A_SpellCheck {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int n = obj.nextInt();
            String str = obj.next();

            if(n != 5) {
                System.out.println("NO");
                continue;
            }

            int[] freq = new int[128];
            for(char c : "Timur".toCharArray()) {
                freq[c]++;
            }


            boolean flag = true;
            for (int i = 0; i < n; i++) {
                char c = str.charAt(i);
                if (--freq[c] < 0) {
                    flag = false;
                    break;
                }
            }

            System.out.println((flag) ? "YES" : "NO");
        }
    }
}
