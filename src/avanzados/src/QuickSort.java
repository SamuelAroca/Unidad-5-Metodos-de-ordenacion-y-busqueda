public class QuickSort {
    public static void main(String[] args) {
        int[] a = {6, 5, 2, 3, 4, 0};
        quicksort(a);
        for (int j : a) {
            System.out.print(" " + j);
        }
    }
    public static void quicksort(int[] a) {
        quicksort(a, 0, a.length - 1);
    }

    private static void quicksort(int[] a, int primero, int ultimo) {
        int i, j, central;
        double pivote;
        central = (primero + ultimo) / 2;
        pivote = a[central];
        i = primero;
        j = ultimo;
        do {
            while (a[i] < pivote)
                i++;
            while (a[j] > pivote)
                j--;
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j)
            quicksort(a, primero, j); // mismo proceso con sublista izqda
        if (i < ultimo)
            quicksort(a, i, ultimo); // mismo proceso con sublista drcha
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
}
