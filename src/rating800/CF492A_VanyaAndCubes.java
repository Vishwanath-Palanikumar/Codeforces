package rating800;

import java.util.Scanner;

public class CF492A_VanyaAndCubes {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();

        int sum = 0, count = 0, i = 1;
        while(true) {
            int row = (i * (i + 1)) / 2;

            if(sum + row > n)
                break;

            sum += row;
            count++; i++;
        }

        System.out.println(count);
    }
}
