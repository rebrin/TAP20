package com.sun.ejecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class PruebaThreadPool {
    static AtomicInteger sheepCount=new AtomicInteger(0);

    public  void incrementAndReport(){
        System.out.print(sheepCount.incrementAndGet()+" ");
    }

    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(20);
        PruebaThreadPool sheep=new PruebaThreadPool();
        try{
        for (int i = 0; i < 10; i++) {
            service.submit(()->{
                sheep.incrementAndReport();
            });
        }}finally {
            if(service!=null) service.shutdown();
        }
    }
}
