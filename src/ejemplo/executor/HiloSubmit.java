package ejemplo.executor;

import java.util.concurrent.*;

public class HiloSubmit {
    private static int contador=0;
    public static void main(String[] args) throws InterruptedException,
            ExecutionException, TimeoutException {
        ExecutorService service=null;
        try{
            service= Executors.newSingleThreadExecutor();
            Future<?> resultado=service.submit(()->{
                for(int i=0;i<500;i++) contador++;
            });
            resultado.get(10, TimeUnit.SECONDS);
            System.out.println("terminado "+contador);
        }finally{
            if(service!=null) service.shutdown();
        }
    }
}
