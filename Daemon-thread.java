package com.company;

public class Main extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){//checking for daemon thread
            System.out.println("Daemon thread work");
        }
        else{
            System.out.println("User thread work");
        }
    }
    public static void main(String[] args){
        Main thread1 = new Main();
        Main thread2 = new Main();
        thread1.setDaemon(true);//now t1 is daemon thread

        thread1.start();//starting threads
        thread2.start();
    }
}