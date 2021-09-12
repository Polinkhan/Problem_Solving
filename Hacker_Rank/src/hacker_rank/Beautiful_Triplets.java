package hacker_rank;

import java.util.Scanner;

public class Beautiful_Triplets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int d = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int final_count = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            int temp = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == temp + d) {
                    temp = arr[j];
                    count++;
                }
                if (count == 2) {
                    final_count++;
                    break;
                }
            }

        }
        System.out.println(final_count);
    }
}