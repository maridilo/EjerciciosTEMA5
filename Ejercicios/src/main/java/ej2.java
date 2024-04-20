public class ej2 {
    public static void imprimirNumerosNaturales(int a, int d) {
        if (a <= d) {
            System.out.print(a + " ");
            imprimirNumerosNaturales(a + 1, d);
        }
    }
}
