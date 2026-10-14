/*
1873 A. Short Sort
https://codeforces.com/problemset/problem/1873/A

Example

Input
6
abc
acb
bac
bca
cab
cba

Output
YES
YES
YES
NO
NO
YES
*/

package rating800;
import java.util.*;

public class CF1873A_ShortSort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            String str = obj.next();
            int count = 0;

            count += (str.charAt(0) != 'a') ? 1 : 0;
            count += (str.charAt(1) != 'b') ? 1 : 0;
            count += (str.charAt(2) != 'c') ? 1 : 0;

            System.out.println((count == 0 || count == 2) ? "YES" : "NO");
        }
    }
}
