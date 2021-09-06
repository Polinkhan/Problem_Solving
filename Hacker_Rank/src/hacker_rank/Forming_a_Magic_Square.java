package hacker_rank;
import java.util.Scanner;

class Result {

    static int arr[][] = new int[3][3];
    static int row[] = new int[3];
    static int col[] = new int[3];
    static int sum;

    static int getrow(int arr[]) {
        sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }

    static int getcol(int j) {
        sum = 0;
        for (int i = 0; i < 3; i++) sum += arr[i][j];
        return sum; 
    }

    static void row_col_gen(int i) {

        if (i < 3) {
            row[i] = getrow(arr[i]);
            col[i] = getcol(i);
            row_col_gen(i + 1);
        }
    }
    static void formingMagicSquare(){
        row_col_gen(0);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(row[i]==col[j] && row[i]<15){
                    arr[i][j]+=(15-row[i]);
                    row_col_gen(0);
                }
            }
        }
    }
    static void display(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i : row) System.out.print( "r"+i + " ");
        System.out.println();
        for(int i : col) System.out.print( "c"+i + " ");
    }
}

public class Forming_a_Magic_Square {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Result.arr[i][j] = scan.nextInt();
            }
        }
        Result.row_col_gen(0);
        System.out.println();
        Result.display();
        Result.formingMagicSquare();
        System.out.println();
        Result.display();
    }
}
