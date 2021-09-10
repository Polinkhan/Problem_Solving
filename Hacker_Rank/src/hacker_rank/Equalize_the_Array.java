package hacker_rank;

import java.util.Scanner;

public class Equalize_the_Array {
    static int count[] = new int[101];
    static int delete_requre(){
        int temp = count[0];
        for(int i=1;i<101;i++){
            if(count[i]>temp)temp = count[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            count[scan.nextInt()]++;
        }
        System.out.println(n-delete_requre());
    }
}
