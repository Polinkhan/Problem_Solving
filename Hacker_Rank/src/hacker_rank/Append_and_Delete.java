package hacker_rank;

import java.util.Scanner;

public class Append_and_Delete {

    static int count = 0;
    static int index = 0;

    static void for_delete(StringBuilder s, StringBuilder t) {

        while (index < s.length() && index < t.length()) {
            if (s.charAt(index) != t.charAt(index)) {
                s.deleteCharAt(index);
                count++;
            } else {
                index++;
            }
        }
        if(s.indexOf(String.valueOf(t))==0){
            while(!String.valueOf(s).equals(String.valueOf(t))){
                s.deleteCharAt(index);
                count++;
            }
        }
    }

    static void for_add(StringBuilder s, StringBuilder t) {
        while (!String.valueOf(s).equals(String.valueOf(t))) {
            s.append(t.charAt(index++));
            count++;
        }
    }

    static boolean check(StringBuilder s, StringBuilder t, int k) {

        if (String.valueOf(s).equals(String.valueOf(t))) {
            return true;
        } else {
            for_delete(s, t);
            for_add(s, t);
        }
        return count <= k;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();

        s.append(scan.next());
        t.append(scan.next());
        int k = scan.nextInt();

        System.out.println(check(s, t, k) ? "Yes" : "No");
    }
}
