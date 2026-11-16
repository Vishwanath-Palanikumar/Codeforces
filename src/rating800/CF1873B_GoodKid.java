/**
 * Problem: 1873B - Good Kid
 * Rating: 800
 * Platform: Codeforces
 * Link: https://codeforces.com/problemset/problem/1873/B
 *
 * Problem Summary:
 * Given an array of n non-negative integers, increase exactly one
 * element by 1 to maximize the product of all array elements.
 *
 * Input:
 * - First line contains t, the number of test cases.
 * - Each test case contains n, the size of the array.
 * - The next line contains n non-negative integers.
 *
 * Output:
 * - Print the maximum possible product for each test case.
 *
 * Approach:
 * - Calculate the product of all non-zero elements.
 * - Find the minimum non-zero element.
 * - Count the number of zeroes separately.
 * - If at least one zero exists:
 *   - Increment one zero by 1.
 *   - If other zeroes remain, the product is still zero.
 *   - Otherwise, the product equals the product of all non-zero elements.
 * - If there are no zeroes:
 *   - Divide the product by the minimum element.
 *   - Multiply it by (minimum + 1) to account for the increment.
 *
 * Time Complexity: O(n) per test case.
 * Space Complexity: O(1) auxiliary space.
 */

package rating800;

import java.util.Scanner;

public class CF1873B_GoodKid {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int n = obj.nextInt();
            int prod = 1, zero = 0, min = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++) {
                int num = obj.nextInt();

                if(num == 0)
                    zero++;
                else {
                    prod *= num;
                    min = Math.min(min, num);
                }
            }
            if(zero > 0)
                zero--;
            else {
                prod /= min;
                min++;
                prod *= min;
            }

            System.out.println((zero > 0) ? 0 : prod);
        }
    }
}
