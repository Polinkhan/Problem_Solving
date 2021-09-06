package hacker_rank;

import java.util.Scanner;

public class Angry_Professor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        while(t-->0){
        int x = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;
        while(x-->0)if(scan.nextInt()<1) count++;
        System.out.println(count<k? "YES":"NO");
        }
    }
}
