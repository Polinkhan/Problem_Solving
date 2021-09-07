package hacker_rank;

import java.util.Scanner;

public class Save_the_Prisoner_Uncomplete {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (m > n) {
                
                m %= n;
                System.out.println(m);
            }
            int s = scan.nextInt();
            System.out.println(m + s - 1);
        }
    }
}
