package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1");
        }
    }
}
class Thread2 extends Thread{
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Thread 2");
        }
    }
}
class Main extends Thread{
    public static void main(String []args){
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();
    }
}