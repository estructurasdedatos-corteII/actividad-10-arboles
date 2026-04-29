public class ArbolBinario {
    Nodo raiz; // Punto de origen Raiz

    public ArbolBinario() {
        raiz = null;
    }

    // MÉTRICA: Obtener altura del arbol
    public int getAltura(Nodo nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(getAltura(nodo.izquierdo), getAltura(nodo.derecho));
    }

    // MÉTRICA: Contar hojas Nodos 
    public int contarHojas(Nodo nodo) {
        if (nodo == null) return 0;
        if (nodo.esHoja()) return 1;
        return contarHojas(nodo.izquierdo) + contarHojas(nodo.derecho);
    }

    // REPRESENTACIÓN GRÁFICA Impresión jerárquica ASCII
    public void imprimirArbol(Nodo nodo, String prefijo, boolean esIzquierdo) {
        if (nodo != null) {
            System.out.println(prefijo + (esIzquierdo ? "├── " : "└── ") + nodo.valor);
            imprimirArbol(nodo.izquierdo, prefijo + (esIzquierdo ? "│   " : "    "), true);
            imprimirArbol(nodo.derecho, prefijo + (esIzquierdo ? "│   " : "    "), false);
        }
    }
}
