package hacker_rank;

import java.util.Arrays;
import java.util.Scanner;

public class ACM_ICPC_Team {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int count = 0;
        int max = 0;

        int topics[][] = new int[n][m];
        int n_teams = 0;
        for (int i = 0; i < n; i++) {
            String str = scan.next();
            for (int j = 0; j < m; j++) {
                topics[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (topics[i][k] == 1 || topics[j][k] == 1) {
                        count++;
                    }
                }
                if (max == count) {
                    n_teams++;
                }
                if (count > max) {
                    max = count;
                    n_teams = 1;
                }
                count = 0;
            }
        }
        System.out.println(max + "\n" + n_teams);

    }
}
