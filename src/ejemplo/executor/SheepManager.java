package ejemplo.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
    private int sheepCount=0;
    private synchronized void incrementAndReport(){
        System.out.print(++sheepCount+" ");
    }
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(20);
        SheepManager sheepManager=new SheepManager();
        try{ for (int i = 0; i < 10; i++) {
                    service.submit(()->{sheepManager.incrementAndReport();});
            }
        }finally {
            if(service!=null) service.shutdown();
        }
    }
}
