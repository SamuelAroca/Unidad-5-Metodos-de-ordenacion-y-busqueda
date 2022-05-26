public class Insercion {
    public static void main(String[] args) {
        int a[] = {51, 21, 39, 80, 36};
        ordInsercion(a);
        for (int j : a) {
            System.out.print(" " + j);
        }
    }

    public static void ordInsercion(int[] a) {
        int i, j;
        int aux;
        for (i = 1; i < a.length; i++) {
            /*
             * indice j es para explorar la sublista a[i-1]..a[0] buscando la posicion
             * correcta del elemento destino
             */
            j = i;
            aux = a[i];
            // se localiza el punto de inserción explorando hacia abajo
            while (j > 0 && aux < a[j - 1]) {
                // desplazar elementos hacia arriba para hacer espacio
                a[j] = a[j - 1];
                j--;
            }
            a[j] = aux;
        }
    }
}
