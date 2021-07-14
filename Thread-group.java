package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String args[]) {
        ThreadGroup threadGroup = new ThreadGroup("ThreadGroup");
        Thread thread1 = new Thread(threadGroup, "First");
        Thread thread2 = new Thread(threadGroup, "Second");
        threadGroup.setMaxPriority(3);
        Thread thread3 = new Thread(threadGroup, "Third");
        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
        System.out.println(thread3.getPriority());
    }
}