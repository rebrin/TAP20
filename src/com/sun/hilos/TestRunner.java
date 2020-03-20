package com.sun.hilos;

public class TestRunner {
    public static void main(String[] args) {
        HelloRunner h1=new HelloRunner("runner1");
        HelloRunner h2=new HelloRunner("runner2");
        Thread t1=new Thread(h1);
        Thread t2=new Thread(h2);
        RunnerThread runnerThread=new RunnerThread("runnerthread");
        runnerThread.start();
//        t1.setPriority(9);
//        t2.setPriority(2);
        t2.start();
        t1.start();
        t1.yield();

        //is alive; determinar si esta vivo
        if(t1.isAlive())
            System.out.println("hilo 1 vivo");
        //prioridad
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());




    }
}
