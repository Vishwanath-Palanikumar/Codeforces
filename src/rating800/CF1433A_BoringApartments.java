/*
 * Problem: 1433A - Boring Apartments
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1433/A
 *
 * Summary:
 * Given a boring apartment number x consisting of identical
 * digits, determine the total number of keypresses required
 * to call all boring apartments up to and including x.
 *
 * Input:
 * - Number of test cases (t).
 * - A boring apartment number (x) for each test case.
 *
 * Output:
 * - Print the total number of keypresses for each test case.
 *
 * Approach:
 * 1. Extract the repeated digit using x % 10.
 * 2. Each completed digit group requires 10 keypresses,
 *    since 1 + 2 + 3 + 4 = 10.
 * 3. Calculate the keypresses from previous digit groups
 *    directly using (x % 10 - 1) * 10.
 * 4. Count the number of digits in x by repeatedly
 *    dividing a temporary variable by 10.
 * 5. Calculate the keypresses for the current digit group
 *    using the sum of the first count natural numbers:
 *    count * (count + 1) / 2.
 * 6. Add both values and print the total keypresses.
 *
 * Formula:
 * Total keypresses = 10 * (d - 1) + k * (k + 1) / 2
 * where d is the repeated digit and k is the digit count.
 *
 * Time Complexity: O(1) per test case, since the apartment
 * number contains at most four digits.
 *
 * Space Complexity: O(1) auxiliary space.
 */

package rating800;

import java.util.Scanner;

public class CF1433A_BoringApartments {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int x = obj.nextInt();
            int ans = (x % 10 - 1) * 10, temp = x, count = 0;
            while(temp > 0) {
                temp /= 10;
                count++;
            }
            System.out.println(ans + (count * (count + 1) / 2));
        }

        obj.close();
    }
}
