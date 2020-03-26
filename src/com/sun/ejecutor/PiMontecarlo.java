package com.sun.ejecutor;

public class PiMontecarlo {
    //todo pasarlo a hilos
    public static void main(String[] args) {
        double x,y;
        double dentro=0;
        double N=100000000;

        for (int i = 0; i < N; i++) {
            x=Math.random();
            y=Math.random();
            if((x*x+y*y)<=1)
                dentro++;
        }
        System.out.println(4.0d*(dentro/N));
    }
}
