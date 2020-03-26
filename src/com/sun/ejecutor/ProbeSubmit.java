package com.sun.ejecutor;

import java.util.concurrent.*;

public class ProbeSubmit {
    public static Integer contador=0;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newSingleThreadExecutor();
        try{
            Future<Integer> res=service.submit(()->{
                for (int i = 0; i < 500; i++) {
                    contador++;
                }
                return contador;
                    }
            );
            System.out.println(res.get());
        } finally {
            if(service!=null) service.shutdown();
        }

    }
}
