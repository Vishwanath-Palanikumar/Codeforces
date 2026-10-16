/*
 * Codeforces 1950A - Stair, Peak, or Neither
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1950/A
 *
 * Problem:
 * Given three digits a, b, and c, determine whether they
 * form a stair, a peak, or neither.
 *
 * Input:
 * t test cases, each containing three integers a, b, and c.
 *
 * Output:
 * Print "STAIR" if a < b < c.
 * Print "PEAK" if a < b and b > c.
 * Otherwise, print "NONE".
 *
 * Approach:
 * First, check whether a < b and b < c to identify a stair.
 * Otherwise, check whether a < b and b > c to identify a peak.
 * If neither condition holds, print "NONE".
 *
 * Complexity: O(1) time and O(1) extra space per test case.
 */

package rating800;

import java.util.Scanner;

public class CF1950A_StairPeakOrNeither {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            int c = obj.nextInt();

            if(a < b && b < c)
                System.out.println("STAIR");
            else if(a < b && b > c)
                System.out.println("PEAK");
            else
                System.out.println("NONE");
        }

        obj.close();
    }
}
