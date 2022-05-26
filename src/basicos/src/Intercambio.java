public class Intercambio {
    public static void main(String[] args) {
        int[] a = {8, 4, 6, 2, 1, 7, 10, 3, 5, 9};
        ordIntercambio(a);
        for (int j : a) {
            System.out.print(" " + j);
        }
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    public static void ordIntercambio(int[] a) {
        int i, j;
        for (i = 0; i < a.length - 1; i++)
            // sitúa mínimo de a[i+1]...a[n-1] en a[i]
            for (j = i + 1; j < a.length; j++)
                if (a[i] > a[j]) {
                    intercambiar(a, i, j);
                }
    }
}
