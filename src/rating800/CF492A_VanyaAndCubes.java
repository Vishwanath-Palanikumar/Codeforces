/**
 * Problem: 492A - Vanya and Cubes
 * Rating: 800
 * Platform: Codeforces
 * Link: https://codeforces.com/problemset/problem/492/A
 *
 * Problem Summary:
 * Given n cubes, construct a pyramid where the i-th level requires
 * 1 + 2 + ... + i cubes.
 * Find the maximum possible height of the pyramid.
 *
 * Input:
 * - A single integer n representing the available number of cubes.
 *
 * Output:
 * - Print the maximum height of the pyramid.
 *
 * Approach:
 * - Start with the first level and calculate the cubes required
 *   for each subsequent level using i * (i + 1) / 2.
 * - Before adding a level, check whether the total required cubes
 *   would exceed the available number of cubes.
 * - If it exceeds n, stop.
 * - Otherwise, add the required cubes and increment the height.
 *
 * Time Complexity: O(cuberoot(n)).
 * Space Complexity: O(1) auxiliary space.
 */

package rating800;

import java.util.Scanner;

public class CF492A_VanyaAndCubes {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();

        int sum = 0, count = 0, i = 1;
        while(true) {
            int row = (i * (i + 1)) / 2;

            if(sum + row > n)
                break;

            sum += row;
            count++; i++;
        }

        System.out.println(count);
    }
}
