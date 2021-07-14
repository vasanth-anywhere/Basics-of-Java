package com.company;

class MyThread extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Child Thread");
        }
    }
}
public class Main {
    public static void main(String args[]) {
        MyThread mythread = new MyThread();
        mythread.start();
        for(int i=0;i<5;i++) {
            System.out.println("Main Thread");
        }
    }
}
