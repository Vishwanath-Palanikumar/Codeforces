/*
1858 A. Buttons
https://codeforces.com/problemset/problem/1858/A

Example

Input
5
1 1 1
9 3 3
1 2 3
6 6 9
2 2 8

Output
First
First
Second
First
Second
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
