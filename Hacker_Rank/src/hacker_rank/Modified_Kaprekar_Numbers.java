package hacker_rank;

import java.util.Scanner;

public class Modified_Kaprekar_Numbers {
    
    static String output = null;
    
    static void kaprekar(String num){
        
        String temp = num;
        int len = num.length();
        num = String.valueOf((long)Math.pow(Long.parseLong(num), 2));
        String l = num.substring(0,num.length()-len);
        String r = num.substring(num.length()-len,num.length());
        if(num.length()>1 && Long.parseLong(l)+Long.parseLong(r)==Long.parseLong(temp)){
            if(output==null){
                output = temp;
            } else{
                output+=" " + temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        if(p==1) output = "1";
        for(int i = p;i<=q;i++){
            kaprekar(String.valueOf(i));
        }
        if(output == null){
        System.out.println("INVALID RANGE");
        } else{
            System.out.println(output);
        }
    }
}
