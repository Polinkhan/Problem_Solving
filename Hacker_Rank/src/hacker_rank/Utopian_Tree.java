package hacker_rank;

import java.util.Scanner;

public class Utopian_Tree {

    static int height[];

    static int getheight(int period) {
        if (period == 0) return 1;
        return (period % 2 == 0 ? getheight(period - 1) + 1 : getheight(period - 1) * 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        height = new int[t];
        while (t-- > 0)
            System.out.println(getheight(scan.nextInt()));
    }
}
