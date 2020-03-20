package com.sun.hilos;

public class RunnerThread  extends Thread{
    String nombre;
    public RunnerThread(String nom){
        nombre=nom;
    }
    @Override
    public void run() {
        int cont=0;
        while(cont<50){
            cont++;
            System.out.println("hilo:"+nombre+" "+cont);
            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
