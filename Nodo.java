/**
 * Clase que representa un Nodo del árbol.
 * - Padre: El nodo que precede a este.
 * - Hijo: Nodos que dependen de este (izq/der).
 */
public class Nodo {
    int valor; // Dato almacenado
    Nodo izquierdo; // RELACIÓN: Referencia al Hijo Izquierdo
    Nodo derecho;   // RELACIÓN: Referencia al Hijo Derecho

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}
