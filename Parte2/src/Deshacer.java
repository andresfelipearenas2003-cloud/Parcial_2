import java.util.Stack;
public class Deshacer {public static void main(String[] args) {

    Stack<String> acciones = new Stack<>();

    acciones.push("Editar perfil");
    acciones.push("Cambiar contraseña");
    acciones.push("Eliminar registro");

    System.out.println("Acciones: " + acciones);

    // Deshacer dos veces
    acciones.pop();
    acciones.pop();

    System.out.println("Estado actual: " + acciones);
}
}

