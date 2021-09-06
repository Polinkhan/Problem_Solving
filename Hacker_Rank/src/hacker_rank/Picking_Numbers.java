package hacker_rank;

import java.util.Arrays;
import java.util.Scanner;

public class Picking_Numbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[scan.nextInt()];
        for (int i=0;i<arr.length;i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int index = 0;
        int count = 0;
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-arr[index]==0 || arr[i]-arr[index]==1){
                temp++;
            }else{
                temp = 0;
                index = i;
                temp++;
            }
            if(temp>count) count = temp;
        }
        System.out.println(count);
    }
}
