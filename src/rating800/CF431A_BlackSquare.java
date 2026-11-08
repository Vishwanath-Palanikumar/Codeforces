/**
 * Problem: 431A - Black Square
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/431/A
 *
 * Summary:
 * Calculate the total calories consumed by touching black
 * squares appearing on four different strips.
 *
 * Input:
 * Four integers representing the calorie cost of each strip,
 * followed by a string representing the strip touched each second.
 *
 * Output:
 * The total calories consumed.
 *
 * Approach:
 * Store the calorie costs in an array of size 4.
 * Iterate through each character in the input string.
 * Convert the character into a zero-based array index by
 * subtracting '1' from it, then add the corresponding
 * calorie cost to the answer.
 *
 * Time Complexity: O(n), where n is the length of the string.
 * Space Complexity: O(1) auxiliary space.
 */

package rating800;

import java.util.Scanner;

public class CF431A_BlackSquare {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++) {
            arr[i] = obj.nextInt();
        }

        String s = obj.next();

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - '1';
            ans += arr[index];
        }

        System.out.println(ans);
    }
}
