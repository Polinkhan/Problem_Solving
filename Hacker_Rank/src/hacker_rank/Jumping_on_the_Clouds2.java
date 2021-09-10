package hacker_rank;

import java.util.Scanner;

public class Jumping_on_the_Clouds2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int count = 0;
        int n = scan.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i+2<n && arr[i+2]==0){
                System.out.println(i);  
                i++;
                count++;
                continue;
            }
            if(i!=n-1 && arr[i]==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
