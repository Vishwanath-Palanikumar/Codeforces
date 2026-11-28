/*
 * Problem: 1772A - A+B?
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1772/A
 *
 * Summary:
 * Given an expression of the form "a+b", where both a and b
 * are single-digit integers between 0 and 9, evaluate the
 * expression and print its result.
 *
 * Input:
 * - Number of test cases (t).
 * - A string representing an expression of the form "a+b"
 *   for each test case.
 *
 * Output:
 * - Print the sum of the two integers for each test case.
 *
 * Approach:
 * 1. Read the expression as a string.
 * 2. Extract the first digit using str.charAt(0).
 * 3. Extract the second digit using str.charAt(2).
 * 4. Convert both digit characters into integers by
 *    subtracting the character '0'.
 * 5. Ignore the '+' operator at index 1.
 * 6. Add the two integers and print the result.
 *
 * Time Complexity: O(1) per test case, since the expression
 * always contains exactly three characters.
 *
 * Space Complexity: O(1) auxiliary space.
 */

package rating800;

import java.util.Scanner;

public class CF1772A_aPlusB {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            String str = obj.next();
            int a = str.charAt(0) - '0', b = str.charAt(2) - '0';
            System.out.println(a + b);
        }

        obj.close();
    }
}
