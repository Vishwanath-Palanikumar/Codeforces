package rating800;

import java.util.Scanner;

public class CF1853A_Desorting {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        while(t-- > 0) {
            int n = obj.nextInt();
            int prev = obj.nextInt();
            int minDiff = Integer.MAX_VALUE;

            for(int i = 1; i < n; i++) {
                int num = obj.nextInt();
                minDiff = Math.min(minDiff, num - prev);
                prev = num;
            }

            System.out.println((minDiff < 0) ? 0 : minDiff / 2 + 1);
        }

        obj.close();
    }
}
