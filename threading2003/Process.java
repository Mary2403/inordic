package org.example.threading2003;

import org.example.threading2003.Details;

import java.util.concurrent.atomic.AtomicInteger;

public class Process extends Thread{
    private Details details;

    @Override
    public void run() {
       productingDetails(details.getQuantityDetails());
    }

    public Process(Details details) {
        this.details = details;
    }

    public void productingDetails(AtomicInteger details) {


        for (int i = 0; i < 4; i++) {
            System.out.println("Произведена " + details + " деталь");
            details.decrementAndGet();
        }

    }
}


