package rating800;

import java.util.Scanner;

public class CF9A_DieRoll {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int y = obj.nextInt();
        int w = obj.nextInt();

        int max = Math.max(y, w);
        int chances = 6 - max + 1;
        int gcd = gcd(chances, 6);

        System.out.println((chances / gcd) + "/" + (6 / gcd));
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
