/*
 * Codeforces 9A - Die Roll
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/9/A
 *
 * Problem:
 * Two friends roll a die. Given the results y and w,
 * determine the probability that the next roll is at least
 * as large as the maximum of y and w.
 *
 * Input:
 * Two integers y and w, representing the friends' die results.
 *
 * Output:
 * Print the probability as a simplified fraction.
 *
 * Approach:
 * Find the maximum of y and w. The number of favourable
 * outcomes is 6 - max(y, w) + 1, since any result from
 * max(y, w) through 6 is favourable.
 * The total number of possible outcomes is 6.
 * Use the GCD of the favourable outcomes and 6 to simplify
 * the fraction.
 *
 * Complexity: O(1) time and O(1) extra space.
 */

package rating800;

import java.util.Scanner;

public class CF9A_DieRoll {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int y = obj.nextInt();
        int w = obj.nextInt();

        int max = Math.max(y, w);
        int chances = 6 - max + 1;
        int gcd = gcd(chances, 6);

        System.out.println((chances / gcd) + "/" + (6 / gcd));
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
