package hacker_rank;

import java.util.Scanner;

public class Plus_Minus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positive = 0, negetive = 0, zero = 0, count = scan.nextInt();
        int temp = count;
        while (temp-- > 0) {
            int x = scan.nextInt();
            if (x > 0) {
                positive++;
            } else if (x < 0) {
                negetive++;
            } else {
                zero++;
            }
        }
        System.out.println((float)positive/count);
        System.out.println((float)negetive/count);
        System.out.println((float)zero/count);
    }
}
