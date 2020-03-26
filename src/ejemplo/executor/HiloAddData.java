package ejemplo.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class HiloAddData {
    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        ExecutorService service=null;
        try{
            service= Executors.newSingleThreadExecutor();
            Future<Integer> res=service.submit(()->30+13);
            System.out.println(res.get());
        }finally {
            if(service!=null) service.shutdown();
        }
    }
}
