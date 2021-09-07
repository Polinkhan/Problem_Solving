package hacker_rank;

import java.util.Scanner;

public class Sequence_Equation {

    static int equation(int x,int arr[]){
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==x)break;
        }
        return i+1;
    }
    static void sequence(int arr[]){
        for(int i=1;i<=arr.length;i++){
            int temp = equation(i,arr);
            System.out.println(equation(temp,arr));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        int arr[] = new int[scan.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        sequence(arr);
    }
}
