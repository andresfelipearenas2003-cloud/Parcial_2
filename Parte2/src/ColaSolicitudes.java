import java.util.LinkedList;
import java.util.Queue;

public class ColaSolicitudes {public static void main(String[] args) {

    Queue<String> cola = new LinkedList<>();

    // Llegan solicitudes
    cola.add("S1");
    cola.add("S2");
    cola.add("S3");
    cola.add("S4");
    cola.add("S5");

    System.out.println("Cola inicial: " + cola);

    // Atender 3
    cola.poll();
    cola.poll();
    cola.poll();

    System.out.println("En espera: " + cola);
}
}

