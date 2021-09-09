package hacker_rank;

import java.util.Scanner;

public class Jumping_on_the_Clouds {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int p = 0;
        int energy = 100;
        while (true) {
            p = (p + k) % n;
            if (arr[p] == 1) {
                energy -= 3;
                p += k;
            } else {
                energy--;
                p += k;
            }
            p = (p + k) % n;
            if (p == 0) {
                break;
            }
        }
        System.out.println(energy);
    }
}
