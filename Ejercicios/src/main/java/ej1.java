public class ej1 {
    public static int sumNaturales(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumNaturales(n - 1);
        }
    }

}
