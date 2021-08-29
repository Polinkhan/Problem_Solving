package hacker_rank;

import java.util.Scanner;

public class Time_Conversion {

    static String time_converter(String time) {
        String am_pm = time.substring(time.length() - 2, time.length());
        String hour = time.substring(0, 2);
        time = time.substring(2, time.length() - 2);

        if (am_pm.equals("AM")) {
            hour = String.valueOf(Integer.parseInt(hour) % 12);
            if (hour.length()==1) {
                hour = "0"+hour;
            }
        } else {
            hour = String.valueOf((Integer.parseInt(hour) % 12) + 12);
        }
        return hour + time;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(time_converter(scan.next()));
    }
}
