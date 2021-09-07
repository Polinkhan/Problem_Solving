package hacker_rank;

import java.util.Scanner;

public class Beautiful_Days_at_the_Movies {
    
    static int defference(int x,int y){
        if(x-y>=0) return x-y;
        else return (x-y)*-1;
    }
    
    static int calculation(int x,int k){
        StringBuilder str = new StringBuilder();
        str.append(String.valueOf(x));
        int def = defference(Integer.parseInt(String.valueOf(str)),Integer.parseInt(String.valueOf(str.reverse())));
        if(def%k==0) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int start = scan.nextInt();
        int stop = scan.nextInt();
        int k = scan.nextInt();
        int sum = 0;
        for(int i = start;i<=stop;i++){
            sum += calculation(i,k);
        }
        System.out.println(sum);
    }
}
