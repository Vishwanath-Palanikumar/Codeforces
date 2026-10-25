/**
 * Problem: 703A - Mishka and Game
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/703/A
 *
 * Summary:
 * Count the number of rounds won by Mishka and Chris.
 *
 * Input:
 * Integer n, followed by n pairs of scores (Mishka, Chris).
 *
 * Output:
 * "Mishka" if Mishka wins more rounds,
 * "Chris" if Chris wins more rounds,
 * otherwise "Friendship is magic!^^".
 *
 * Approach:
 * Compare the scores in each round and increment the
 * winner's counter. Ignore tied rounds. Compare the
 * final win counts to determine the result.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package rating800;

import java.util.*;

public class CF703A_MishkaandGame {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();
        int m = 0, c = 0;

        while(t-- > 0) {
            int mishika = obj.nextInt();
            int chris = obj.nextInt();

            if(mishika > chris)
                m++;
            else if(chris > mishika)
                c++;
        }

        if(m == c)
            System.out.println("Friendship is magic!^^");
        else
            System.out.println((m > c) ? "Mishka" : "Chris");
    }
}
