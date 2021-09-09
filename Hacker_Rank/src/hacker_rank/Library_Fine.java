package hacker_rank;

import java.util.Scanner;

public class Library_Fine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d1 = scan.nextInt();
        int m1 = scan.nextInt();
        int y1 = scan.nextInt();
        int d2 = scan.nextInt();
        int m2 = scan.nextInt();
        int y2 = scan.nextInt();
        
        if(y1>y2){
            System.out.print((y1-y2)*10000);
        }
        else if(m1>m2 && y1==y2){
            System.out.print((m1-m2)*500);
        }
        else if(d1>d2 && m1==m2 && y1==y2){
            System.out.print((d1-d2)*15);
        }
        else{
            System.out.print(0);
        }
    }
}
