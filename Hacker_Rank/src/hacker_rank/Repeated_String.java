package hacker_rank;

import java.util.Scanner;

public class Repeated_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String str = scan.next();
        String n = scan.next();
        int a_in_str = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                a_in_str++;
            }
        }
        long temp = Long.parseLong(n)/str.length();
        long a_in_loop = temp*a_in_str;
        for(int i=0;i<Long.parseLong(n)%str.length();i++){
            if(str.charAt(i)=='a'){
                a_in_loop++;
            }
        }
        System.out.println(a_in_loop);
    }
}
