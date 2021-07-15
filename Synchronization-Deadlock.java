package com.company;

class ExampleA {
    public synchronized void methodA(ExampleB objectB)  {
        System.out.println("Thread1 starts Exceution");
        try {
            Thread.sleep(6000);
        }
        catch (InterruptedException exception) {}
        System.out.println("Thread1 call B's normal method");
        objectB.normal();
    }
    public synchronized void normal() {
        System.out.println("Inside A, Normal method");
    }
}
class ExampleB {
    public synchronized void methodB(ExampleA objectA) {
        System.out.println("Thread2 starts Exceution");
        try {
            Thread.sleep(6000);
        }
        catch (InterruptedException exception) {}
        System.out.println("Thread2 call A's normal method");
        objectA.normal();
    }
    public synchronized void normal() {
        System.out.println("Inside B, Normal method");
    }
}
class Main extends Thread{
    ExampleA exampleA = new ExampleA();
    ExampleB exampleB = new ExampleB();
    public void execute() {
        this.start();
        exampleA.methodA(exampleB);
    }
    public void run() {
        exampleB.methodB(exampleA);
    }
    public static void main(String []args){
        Main main = new Main();
        main.execute();
    }
}