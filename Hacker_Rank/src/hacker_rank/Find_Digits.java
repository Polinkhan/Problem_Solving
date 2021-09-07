package hacker_rank;

import java.util.Scanner;

public class Find_Digits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
        String num = scan.next();
        int number = Integer.parseInt(num);
        int count = 0;
        for(int i=0;i<num.length();i++){
            int temp = Integer.parseInt(String.valueOf(num.charAt(i)));
            if(temp!=0 && number%temp==0){
                count++;
            }
        }
        System.out.println(count);
        }
    }
}
