/*
 * Codeforces 432A - Choosing Teams
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/432/A
 *
 * Problem:
 * Given n students and their previous participation counts,
 * find the maximum number of teams of three students such
 * that each student can participate at least k more times
 * without exceeding the maximum of 5 participations.
 *
 * Input:
 * Two integers n and k, followed by n integers representing
 * the previous participation count of each student.
 *
 * Output:
 * Print the maximum number of teams that can be formed.
 *
 * Approach:
 * Calculate the maximum allowed previous participation count
 * as 5 - k. Count students whose participation count is less
 * than or equal to this limit. Divide the eligible student
 * count by 3 to obtain the maximum number of complete teams.
 *
 * Complexity: O(n) time and O(1) extra space.
 */

package rating800;

import java.util.Scanner;

public class CF432A_ChoosingTeams {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int k = obj.nextInt();

        int key = 5 - k;
        int count = 0;

        for(int i = 0; i < n; i++) {
            int val = obj.nextInt();
            if(val <= key)
                count++;
        }

        System.out.println(count / 3);

        obj.close();
    }
}
