package hacker_rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Circular_Array_Rotation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        List<Integer> l = new ArrayList<>();
        
        int length = scan.nextInt();
        int rotate = scan.nextInt();
        int q = scan.nextInt();
        for(int i=0;i<length;i++){
            l.add(scan.nextInt());
        }
        while(rotate-->0){
            int temp = l.remove(length-1);
            l.add(0, temp);
        }
        for(int i=0;i<q;i++){
            System.out.println(l.get(scan.nextInt()));
        }
    }
}
