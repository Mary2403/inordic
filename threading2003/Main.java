package org.example.threading2003;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Details details = new Details(new AtomicInteger(24));
        Process process1 = new Process(details);
        Process process2 = new Process(details);
        Process process3 = new Process(details);
        Process process4 = new Process(details);
        Process process5 = new Process(details);
        Process process6 = new Process(details);
        Thread.sleep(2000);

        process1.start();
        process2.start();
        process2.join();
        process3.start();
        process3.join();
        process4.start();
        process5.start();
        process5.join();
        process6.start();
    }
}
