package ejemplo.executor;
import java.util.concurrent.*;

public class EjemploHiloLambda {
    public static void main(String[] args) {
        ExecutorService servicio=null;
        try {
            servicio = Executors.newSingleThreadExecutor();
            System.out.println("inicia");
            servicio.execute(() -> System.out.println("imprimiendo el inventario"));
            servicio.execute(() -> {
                for (int i = 0; i < 3; i++)
                    System.out.println("registro " + i);
            });
            System.out.println("este texto puede salir antes de terminar " +
                    "pues main es otro hilo");
        }finally {
            if(servicio!=null)  servicio.shutdown();
        }
    }
}
