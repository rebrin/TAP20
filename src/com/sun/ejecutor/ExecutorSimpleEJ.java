package com.sun.ejecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSimpleEJ {

    public static void main(String[] args) {
        ExecutorService servicio= Executors.newSingleThreadExecutor();
        try {
            servicio.execute(() -> {
                System.out.println("esto es un hilo");
            });
            servicio.execute(() -> {
                try {
                    System.out.println("imprimir, dormir");
                    Thread.sleep(7000);
                    System.out.println("imprimir una segunda");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            servicio.execute(() -> {
                System.out.println("asi cuantas veces necesite");
            });
        }finally {
            if(servicio!=null) servicio.shutdown();
        }
    }
}
