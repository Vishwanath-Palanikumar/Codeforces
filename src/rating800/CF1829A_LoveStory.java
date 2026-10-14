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
