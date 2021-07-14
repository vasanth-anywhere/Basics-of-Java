package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
    String name;
    PrintJob(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println(name+" job started by Thread: "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException exception) { }
        System.out.println(name+" job completed by Thread: "+Thread.currentThread().getName());
    }
}
public class Main {
    public static void main(String args[]) {
        PrintJob[] jobs = {
                new PrintJob("Rubin"),
                new PrintJob("John"),
                new PrintJob("Alex"),
                new PrintJob("Mark"),
                new PrintJob("Musk"),
                new PrintJob("Larry")};
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(PrintJob job : jobs) {
            service.submit(job);
        }
        service.shutdown();
    }
}