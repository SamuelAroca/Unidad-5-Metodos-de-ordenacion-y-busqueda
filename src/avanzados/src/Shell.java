public class Shell {
    public static void main(String[] args) {
        int[] a = {6, 5, 2, 3, 4, 0};
        ordShell(a);
        for (int j : a) {
            System.out.print(" " + j);
        }
    }

    public static void ordShell(int[] a) {
        int intervalo, i, j, k;
        int n = a.length;
        intervalo = n / 2;
        while (intervalo > 0) {
            for (i = intervalo; i < n; i++) {
                j = i - intervalo;
                while (j >= 0) {
                    k = j + intervalo;
                    if (a[j] <= a[k])
                        j = -1; // par de elementos ordenado
                    else {
                        //intercambiar(a, j, j + 1);
                        intercambiar(a, j, k);
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
}
