package hacker_rank;

import java.util.Scanner;

public class Minimum_Distances {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        int min = n;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    if(j-i<min) min = j-i;
                }
            }
        }
        if(min==n){
            System.out.println(-1);
        } else{
            System.out.println(min);
        }
        
        
    }
}
