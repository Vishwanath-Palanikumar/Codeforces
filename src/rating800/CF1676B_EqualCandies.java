/*
 * Problem: 1676B - Equal Candies
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1676/B
 *
 * Summary:
 * Given n boxes containing different quantities of candies,
 * determine the minimum number of candies that must be eaten
 * so that all boxes contain an equal number of candies.
 * Candies can only be removed, not added.
 *
 * Input:
 * - Number of test cases (t).
 * - Number of boxes (n) for each test case.
 * - n integers representing the candy count in each box.
 *
 * Output:
 * - Print the minimum total number of candies that must
 *   be eaten to make all boxes contain equal quantities.
 *
 * Approach:
 * 1. Since candies cannot be added, the maximum possible
 *    equal quantity is the minimum candy count among all boxes.
 * 2. Read the first candy count and initialize both the
 *    minimum and sum with its value.
 * 3. Traverse the remaining elements to calculate the total
 *    sum and minimum candy count simultaneously.
 * 4. Calculate the total number of candies that should remain
 *    after equalizing all boxes using min * n.
 * 5. Subtract the remaining candies from the original total
 *    to obtain the minimum number of candies to be eaten.
 *
 * Formula:
 * Answer = sum - (min * n)
 *
 * Time Complexity: O(n) per test case.
 * Space Complexity: O(1) auxiliary space.
 */

package rating800;

import java.util.Scanner;

public class CF1676B_EqualCandies {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int n = obj.nextInt();
            int num = obj.nextInt();
            int min = num, sum = num;

            for(int i = 1; i < n; i++) {
                num = obj.nextInt();
                sum += num;
                min = Math.min(min, num);
            }

            System.out.println(sum - (min * n));
        }

        obj.close();
    }
}
