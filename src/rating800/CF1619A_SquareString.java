/*
 * Problem: 1619A - Square String?
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1619/A
 *
 * Summary:
 * Given a string, determine whether it is a square string.
 * A string is square if it consists of two identical halves.
 *
 * Input:
 * - Number of test cases (t).
 * - A lowercase string for each test case.
 *
 * Output:
 * - Print "YES" if the string consists of two identical halves.
 * - Otherwise, print "NO".
 *
 * Approach:
 * 1. Read the string and calculate its length (n).
 * 2. If n is odd, print "NO" because the string cannot
 *    be divided into two equal halves.
 * 3. Otherwise, calculate the midpoint (mid = n / 2).
 * 4. Compare each character in the first half with the
 *    corresponding character in the second half.
 * 5. If any characters differ, mark isMatch as false
 *    and stop checking further.
 * 6. Print "YES" if all corresponding characters match;
 *    otherwise, print "NO".
 *
 * Time Complexity: O(n) per test case.
 * Space Complexity: O(1) auxiliary space.
 */

package rating800;

import java.util.Scanner;

public class CF1619A_SquareString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            String str = obj.next();
            int n = str.length(), mid = n / 2;

            if(n % 2 != 0) {
                System.out.println("NO");
            } else {
                boolean isMatch = true;

                for(int i = 0; i < n / 2; i++) {
                    if(str.charAt(i) != str.charAt(mid + i)) {
                        isMatch = false;
                        break;
                    }
                }

                System.out.println((isMatch) ? "YES" : "NO");
            }
        }

        obj.close();
    }
}
