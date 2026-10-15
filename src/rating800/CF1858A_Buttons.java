/*
 * Codeforces 1858A - Buttons
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1858/A
 *
 * Problem:
 * Two players have a and b buttons respectively, and c
 * additional shared buttons. Players take turns pressing
 * available buttons, with the first player starting.
 * Determine the winner assuming both play optimally.
 *
 * Input:
 * t test cases, each containing three integers a, b, c.
 *
 * Output:
 * Print "First" if the first player wins, otherwise "Second".
 *
 * Approach:
 * The first player wins if a + b + c is odd;
 * otherwise, the second player wins.
 *
 * Complexity: O(1) time and O(1) space per test case.
 */

package rating800;
import java.util.*;

public class CF1858A_Buttons {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        for(int i = 0; i < t; i++) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            int c = obj.nextInt();

            int cMove = (c + 1) / 2;
            int aMove = a + cMove;
            int bMove = b + (c - cMove);

            System.out.println((aMove > bMove) ? "First" : "Second");
        }
    }
}
