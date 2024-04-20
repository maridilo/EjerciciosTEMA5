public class ej5 {
        public static int calcularMaximo(int[] vector, int inicio, int fin) {
            if (inicio == fin) {
                return vector[inicio];
            } else {
                int medio = (inicio + fin) / 2;
                int maximoIzquierda = calcularMaximo(vector, inicio, medio);
                int maximoDerecha = calcularMaximo(vector, medio + 1, fin);
                return Math.max(maximoIzquierda, maximoDerecha);
            }
        }
    }
