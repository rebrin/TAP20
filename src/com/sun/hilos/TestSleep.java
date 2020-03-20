package com.sun.hilos;

public class TestSleep {

    public static void main(String[] args) {
        HiloSleep h1=new HiloSleep();
        Thread t1=new Thread(h1);
        t1.start();
    }
}
