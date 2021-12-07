package Scheduling_Algorithm;
import java.util.Scanner;

public class Sche_Algo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        out.println("Which Algorithm you want to test!!");
        switch (scan.nextInt()){
            case 1: 
                new fcfs_algo();
                break;
            case 2: 
                out.print("Under Development");
                break;
            case 3: 
                out.print("Under Development");
                break;
            case 4: 
                out.print("Under Development");
                break;
            default :
                out.print("Enter between 1 to 4");
        }
    }

}
