package hacker_rank;

import java.util.Scanner;

public class Viral_Advertising {
    static int sum = 0;
    static void ad(int like,int x){
        if(x==0) return;
        sum+= like/2;
        ad((like/2)*3,x-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        ad(5,x);
        System.out.print(sum);
    }
}
