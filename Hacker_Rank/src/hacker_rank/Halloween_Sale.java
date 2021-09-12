package hacker_rank;

import java.util.Scanner;

public class Halloween_Sale {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int p = scan.nextInt();
        int d = scan.nextInt();
        int m = scan.nextInt();
        int s = scan.nextInt();
        int count = 0;
        
        while(true){
            s-=p;
            if(p>m){
                p-=d;
            }
            if(p<m)p=m;
            if(s<0) break;
            count++;
        }
        System.out.println(count);
    }
}
