package com.sun.hilos;

public class HiloSleep implements Runnable{
    @Override
    public void run() {
        int seg=0;
        while(seg<=60){
            System.out.println(seg++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
