public class ej7 {
        public static int calcularCoeficienteBinomial(int n, int k) {
            // Verificar si n es igual a k o k es igual a 0
            if (k == 0 || n == k) {
                return 1;
            }

            // Caso recursivo
            return calcularCoeficienteBinomial(n - 1, k) + calcularCoeficienteBinomial(n - 1, k - 1);
        }
    }
