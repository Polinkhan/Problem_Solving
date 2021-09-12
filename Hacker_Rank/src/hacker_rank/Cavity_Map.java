package hacker_rank;

import java.util.Scanner;

public class Cavity_Map {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String str[] = new String[n];
        String out_str[] = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = scan.next();
            out_str[i] = str[i];
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int temp = Integer.parseInt(String.valueOf(str[i].charAt(j)));
                int up = Integer.parseInt(String.valueOf(str[i - 1].charAt(j)));
                int down = Integer.parseInt(String.valueOf(str[i + 1].charAt(j)));
                int left = Integer.parseInt(String.valueOf(str[i].charAt(j - 1)));
                int right = Integer.parseInt(String.valueOf(str[i].charAt(j + 1)));
                if (temp > up && temp > down && temp > left && temp > right) {
                    str[i] = str[i].substring(0, j) + "X" + str[i].substring(j + 1, str[i].length());
                    j++;
                }
            }
            String temp = out_str[i];
            out_str[i] = str[i];
            str[i] = temp;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(out_str[i]);
        }
    }
}
