package com.company;

class MyThread implements Runnable {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Child Thread");
        }
    }
}
public class Main {
    public static void main(String args[]) {
        MyThread runnable = new MyThread();
        Thread thread = new Thread(runnable);
        thread.start();
        for(int i=0;i<5;i++) {
            System.out.println("Main Thread");
        }
    }
}
