package hacker_rank;

import java.util.Scanner;

public class Counting_Valleys {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int level = 0, velly = 0;
        int x = scan.nextInt();
        scan.nextLine();
        String str = scan.next();
        for (char c : str.toCharArray()) {
            if (c == 'U') {
                level++;
            } else {
                level--;
            }

            if (c == 'U' && level == 0) {
                velly++;
            }
        }
        System.out.println(velly);
    }
}
