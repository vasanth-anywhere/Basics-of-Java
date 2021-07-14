package com.company;

public class Main extends Thread{
    public void run(){
        Thread.currentThread().setName("Villain");
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    public static void main(String args[]) {
        Main thread = new Main();
        Thread.currentThread().setName("Hero");
        thread.start();
        for(int i=6;i<11;i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
