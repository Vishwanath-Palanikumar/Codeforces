/*
 * Codeforces 1829A - Love Story
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/1829/A
 *
 * Problem:
 * Given a string s of length 10, find the minimum number
 * of positions that must be changed to make s equal to
 * "codeforces".
 *
 * Input:
 * t test cases, each containing a string s of length 10.
 *
 * Output:
 * Print the number of positions where s differs from
 * "codeforces" for each test case.
 *
 * Approach:
 * Compare each character of s with the corresponding
 * character in "codeforces". Increment the counter for
 * every mismatch.
 *
 * Complexity: O(1) time and O(1) extra space per test case.
 */

package rating800;
import java.util.Scanner;

public class CF1829A_LoveStory {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();
        String correct = "codeforces";

        while(t-- > 0) {
            String str = obj.next();
            int count = 0;

            for(int i = 0; i < 10; i++) {
                if(str.charAt(i) != correct.charAt(i))
                    count++;
            }

            System.out.println(count);
        }
    }
}
