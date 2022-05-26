public class Seleccion {
    public static void main(String[] args) {
        int[] a = {51, 21, 39, 80, 36};
        ordSeleccion(a);
        for (int j : a) {
            System.out.print(" " + j);
        }
    }

    /*
     * ordenar un array de n elementos de tipo double utilizando el algoritmo de
     * ordenación por selección
     */
    public static void ordSeleccion(int[] a) {
        int indiceMenor, i, j, n;
        n = a.length;
        for (i = 0; i < n - 1; i++) {
            // comienzo de la exploración en índice i
            indiceMenor = i;
            // j explora la sublista a[i+1]..a[n-1]
            for (j = i + 1; j < n; j++)
                if (a[j] < a[indiceMenor])
                    indiceMenor = j;
            // sitúa el elemento mas pequeño en a[i]
            if (i != indiceMenor)
                intercambiar(a, i, indiceMenor);
        }
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
}
