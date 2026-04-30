public class ArbolBinario {
    Nodo raiz; // El nodo principal (Raíz)

    public ArbolBinario() {
        raiz = null;
    }

    // Inserción con lógica de Árbol Binario de Búsqueda (ABB)
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }
        return actual;
    }

    // MÉTRICA: Altura del árbol (Longitud del camino más largo desde la raíz)
    public int getAltura(Nodo nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(getAltura(nodo.izquierdo), getAltura(nodo.derecho));
    }

    // MÉTRICA: Contar Hojas (Nodos sin descendientes)que es representan el punto final de una rama y no tienen hijos
    public int contarHojas(Nodo nodo) {
        if (nodo == null) return 0;
        if (nodo.izquierdo == null && nodo.derecho == null) return 1;
        return contarHojas(nodo.izquierdo) + contarHojas(nodo.derecho);
    }

    // RECORRIDO: Inorden (Izquierda, Raíz, Derecha) - Entrega valores ordenados
    public void recorridoInorden(Nodo nodo) {
        if (nodo != null) {
            recorridoInorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorridoInorden(nodo.derecho);
        }
    }

    // REPRESENTACIÓN GRÁFICA: Jerarquía por consola
    public void mostrarJerarquia(Nodo nodo, String prefijo, boolean esIzquierdo) {
        if (nodo != null) {
            System.out.println(prefijo + (esIzquierdo ? "├── " : "└── ") + nodo.valor);
            mostrarJerarquia(nodo.izquierdo, prefijo + (esIzquierdo ? "│   " : "    "), true);
            mostrarJerarquia(nodo.derecho, prefijo + (esIzquierdo ? "│   " : "    "), false);
        }
    }
}
