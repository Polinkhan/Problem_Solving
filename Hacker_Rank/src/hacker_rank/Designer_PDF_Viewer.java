package hacker_rank;

import java.util.Scanner;

public class Designer_PDF_Viewer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = scan.nextInt();
        }
        String str = scan.next();
        int max = 0;
        for (char ch : str.toCharArray()) {
            if (arr[(int) ch - 97] > max) {
                max = arr[(int) ch - 97];
            }
        }
        System.out.println(max*str.length());
    }
}
