package Scheduling_Algorithm;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fcfs_algo {

    Scanner scan = new Scanner(System.in);

    List<Boolean> isVisit = new ArrayList<>();
    List<Integer> bTime = new ArrayList<>();
    List<Integer> aTime = new ArrayList<>();
    List<Integer> wTime = new ArrayList<>();
    List<Integer> tTime = new ArrayList<>();
    int n, completeSec = 0, currentSec = 9999;

    void userInput() {
        out.println("Enter the number of process!");
        n = scan.nextInt();
        Collections.fill(isVisit, Boolean.FALSE);
        for (int i = 0; i < n; i++) {
            out.print("Enter burstTime and arivalTime for process " + i + "\n-> ");
            bTime.add(scan.nextInt());
            aTime.add(scan.nextInt());
        }
    }

    int findCurrentProcess() {
        out.print("3");
        int process = 9999;
        for (int i = 0; i < aTime.size(); i++) {
            if (!isVisit.get(i) && aTime.get(i) < currentSec) {
                out.print("4");
                currentSec = aTime.get(i);
                process = i;
            }
        }
        isVisit.set(process, Boolean.TRUE);
        return process;
    }

    void start() {
        out.print("2");
        int currentProcess = findCurrentProcess();
        wTime.set(currentProcess, (completeSec - aTime.get(currentProcess)));
        tTime.set(currentProcess, (wTime.get(currentProcess) + bTime.get(currentProcess)));
        completeSec += bTime.get(currentProcess);
    }
    void display(){
        out.println(wTime);
        out.println(tTime);
    }
    

    fcfs_algo() {
        userInput();
        out.print("1");
        while(n-- > 0)start();
        display();
    }
}
