package hacker_rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cut_the_sticks {

    static List<Integer> list = new ArrayList<>();

    static int find_shortest() {
        int temp = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < temp) {
                temp = list.get(i);
            }
        }
        return temp;
    }

    static int sum() {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    static void cutting(int cut) {
        System.out.println (list.size());
        int shrtst = find_shortest();
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)-shrtst);
            if(list.get(i)==0){
                list.remove(i);
                i--;
            }
        }
    if(sum()>0) cutting(0);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            list.add(scan.nextInt());
        }
        cutting(0);
        
    }
}
