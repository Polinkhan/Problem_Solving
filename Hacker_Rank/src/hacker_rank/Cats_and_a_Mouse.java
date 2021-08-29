package hacker_rank;

import java.util.Scanner;

public class Cats_and_a_Mouse {

    static int distance(int cat, int mouse) {
        if (mouse - cat > 0) {
            return mouse - cat;
        } else {
            return (mouse - cat) * -1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int attemp = scan.nextInt();
        while (attemp-- > 0) {
            int cata = scan.nextInt();
            int catb = scan.nextInt();
            int mouse = scan.nextInt();
            if (distance(cata, mouse) == distance(catb, mouse)) {
                System.out.println("Mouse C");
            } else {
                System.out.println(distance(cata, mouse) < distance(catb, mouse) ? "Cat A" : "Cat B");
            }
        }
    }

}
