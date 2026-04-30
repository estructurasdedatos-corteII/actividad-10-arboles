public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Construcción del árbol
        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        for (int v : valores) arbol.insertar(v);

        System.out.println("--- Representación Jerárquica ---");
        arbol.mostrarJerarquia(arbol.raiz, "", false);

        System.out.println("\n--- Métricas del Árbol ---");
        System.out.println("Altura: " + arbol.getAltura(arbol.raiz));
        System.out.println("Total de Hojas: " + arbol.contarHojas(arbol.raiz));
        
        System.out.print("Recorrido Inorden: ");
        arbol.recorridoInorden(arbol.raiz);
    }
}
