/*
 * Codeforces 80A - Panoramix's Prediction
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/80/A
 *
 * Problem:
 * Given two integers n and m, where n is guaranteed to be prime
 * and m > n, determine whether m is the next prime number after n.
 *
 * Input:
 * Two integers n and m.
 *
 * Output:
 * Print "YES" if m is the next prime after n; otherwise, print "NO".
 *
 * Approach:
 * Start from n + 1 and find the first prime number greater than n
 * using the isPrime() helper method. Compare this prime with m.
 * If they are equal, print "YES"; otherwise, print "NO".
 *
 * Prime Checking:
 * Handle numbers below 2, check divisibility by 2 and 3,
 * then test potential divisors of the form 6k - 1 and 6k + 1
 * up to the square root of the number.
 *
 * Complexity: O(sqrt(m)) time and O(1) extra space.
 */

package rating800;

import java.util.*;

public class CF80A_PanoramixsPrediction {
        private static boolean isPrime(int num) {
            if(num < 2) return false;
            if(num <= 3)    return true;
            if(num % 2 == 0 || num % 3 == 0)    return false;

            for(int i = 5; i * i <= num; i += 6) {
                if(num % i == 0 || num % (i + 2) == 0)
                    return false;
            }

            return true;
        }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int m = obj.nextInt();

        int ans = n + 1;

        while(!isPrime(ans)) {
            ans++;
        }

        System.out.println((ans == m) ? "YES" : "NO");
    }
}
