package hacker_rank;

import java.util.Scanner;

public class Taum_and_Bday {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            long b = scan.nextInt();
            long w = scan.nextInt();
            long bc = scan.nextInt();
            long wc = scan.nextInt();
            long z = scan.nextInt();
            bc = Math.min(bc, wc + z);
            wc = Math.min(wc, bc + z);
            System.out.println(b * bc + w * wc);
        }
    }
}
