package com.sun.hilos;

public class HelloRunner implements Runnable{
    String Nombre;
    public HelloRunner(String nom){
        Nombre=nom;
    }

    @Override
    public void run() {
        int cont=0;
        while(cont<50){
            System.out.println(++cont +" "+Nombre);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
