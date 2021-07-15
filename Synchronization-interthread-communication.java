package com.company;
public class Main{
    public static void main(String []args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        synchronized (myThread) {
            System.out.println("Main thread calling wait method");
            myThread.wait();
            System.out.println("Got notification");
            System.out.println(myThread.total);
        }
    }
}
class MyThread extends Thread {
    int total = 0;
    public void run() {
        synchronized (this) {
            System.out.println("Child thread starts calculation");
            for(int i=1;i<10;i++) total+=i;
            System.out.println("Child giving Notification");
            this.notify();
        }
    }
}