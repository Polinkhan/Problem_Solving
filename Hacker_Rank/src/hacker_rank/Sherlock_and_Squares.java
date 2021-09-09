package hacker_rank;

import java.util.Scanner;

public class Sherlock_and_Squares {

    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int from = scan.nextInt();
            int to = scan.nextInt();
            int root = (int)Math.ceil(Math.sqrt(from));
            while(root*root<= to){
                root++;
                count++;
            }
            System.out.println(count);
            count = 0;
        }
    }
}
