package com.company;

public class Main extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
    public static void main(String args[]) throws InterruptedException {
        Main thread = new Main();
        thread.start();
        thread.join();//The main thread won't get exceuted until thread finishes its job.
        for(int i=6;i<11;i++) {
            System.out.println(i);
        }
    }
}
