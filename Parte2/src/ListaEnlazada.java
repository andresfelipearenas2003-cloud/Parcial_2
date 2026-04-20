import java.util.LinkedList;
public class ListaEnlazada {
    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");

        System.out.println("Lista: " + lista);

        // Eliminar tercer nodo (índice 2)
        lista.remove(2);

        System.out.println("Después de eliminar: " + lista);

        // Agregar al final
        lista.add("G");

        System.out.println("Lista final: " + lista);
    }
}

