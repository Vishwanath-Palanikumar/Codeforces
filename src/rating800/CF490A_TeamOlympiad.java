/*
 * Codeforces 490A - Team Olympiad
 * Rating: 800
 * Link: https://codeforces.com/problemset/problem/490/A
 *
 * Problem:
 * Given n children, each skilled in exactly one subject:
 * 1 = Programming, 2 = Maths, 3 = PE.
 *
 * Form the maximum number of teams, each containing
 * one child from each subject. A child can belong to
 * at most one team.
 *
 * Input:
 * n, followed by n integers representing each child's skill.
 *
 * Output:
 * Maximum number of teams, followed by the 1-based
 * indices of the three children in each team.
 *
 * Approach:
 * Store the indices of each subject in separate lists.
 * The maximum number of teams is the minimum of the
 * three list sizes. Pair the corresponding indices.
 *
 * Complexity: O(n) time, O(n) space.
 */

package rating800;
import java.util.*;

public class CF490A_TeamOlympiad {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();

        List<Integer> programming = new ArrayList<>();
        List<Integer> maths = new ArrayList<>();
        List<Integer> pe = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            int num = obj.nextInt();
            if(num == 1)  programming.add(i);
            else if(num == 2) maths.add(i);
            else pe.add(i);
        }

        int teams = Math.min(programming.size(), Math.min(maths.size(), pe.size()));

        System.out.println(teams);
        for(int i = 0; i < teams; i++) {
            System.out.println(programming.get(i) + " " + maths.get(i) + " " + pe.get(i));
        }
    }
}
