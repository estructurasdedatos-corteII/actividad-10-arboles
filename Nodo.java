/**
 * Clase que representa el componente básico del árbol.
 * logiaca Nodo Interno (si tiene hijos) o Hoja (si no los tiene).
 */
public class Nodo {
    int valor; // Dato del nodo
    Nodo izquierdo, derecho; // Referencias a hijos (Relación: Padre -> Hijo)

    public Nodo(int item) {
        valor = item;
        izquierdo = derecho = null;
    }
}
