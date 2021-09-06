package hacker_rank;

import java.util.Scanner;

public class The_Hurdle_Race {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();
        int arr[] = new int[n];
        int max = 0 ;
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
            if(arr[i]>max) max = arr[i];
        }
        System.out.println(k>max? 0:max-k);
    }
}
