public class ej4 {
        public static int calcularPotencia(int x, int y) {
            if (y == 0) {
                return 1;
            } else if (y == 1) {
                return x;
            } else if (y > 1) {
                return x * calcularPotencia(x, y - 1);
            } else {
                // En caso de que y sea negativo, se devuelve 0 como indicador de error
                return 0;
            }
        }
    }
