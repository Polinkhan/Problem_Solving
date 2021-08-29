package hacker_rank;

import java.util.Scanner;

public class Migratory_Birds {

    public static void main(String[] args) {
        int max = 0;
        int max_value = 0;
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size + 1];
        for (int t : arr) {
            t = 0;
        }
        for (int i = 0; i < size; i++) {
            arr[scan.nextInt()]++;
        }
        for (int i = 0; i < size + 1; i++) {
            if (arr[i] > max_value) {
                max = i;
                max_value = arr[i];
            }
        }
        System.out.println(max);
    }
}
