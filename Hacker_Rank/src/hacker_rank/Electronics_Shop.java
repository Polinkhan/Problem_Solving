package hacker_rank;

import java.util.Scanner;

public class Electronics_Shop {

    static int max = -1;
    static int keyb[];
    static int usb[];

    static void getMoneySpent(int b, int keyb[], int usb[]) {
        for (int i : keyb) {
            for (int j : usb) {
                if (i + j > max && i + j <= b) {
                    max = i + j;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        keyb = new int[scan.nextInt()];
        usb = new int[scan.nextInt()];
        for (int i = 0; i < keyb.length; i++) {
            keyb[i] = scan.nextInt();
        }
        for (int i = 0; i < usb.length; i++) {
            usb[i] = scan.nextInt();
        }
        getMoneySpent(b, keyb, usb);
    }
}
