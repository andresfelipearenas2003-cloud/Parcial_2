import java.util.Stack;
public class Navegacion {
    public static void main(String[] args) {

        Stack<String> pila = new Stack<>();

        // Navegación
        pila.push("Pantalla A");
        pila.push("Pantalla B");
        pila.push("Pantalla C");

        System.out.println("Estado: " + pila);

        // Atrás
        pila.pop();
        pila.pop();

        System.out.println("Pantalla actual: " + pila.peek());
    }
}

