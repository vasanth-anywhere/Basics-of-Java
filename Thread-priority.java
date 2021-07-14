package com.company;

public class Main extends Thread{
    public void run(){
        System.out.println("Running thread name is:"+Thread.currentThread().getName());
        System.out.println("Running thread priority is:"+Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
        Main thread1 = new Main();
        Main thread2 = new Main();
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }
}