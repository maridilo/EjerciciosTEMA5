public class ej3 {
        public static int contarDigitos(int numero) {
            // Caso base: si el número tiene un solo dígito
            if (numero < 10) {
                return 1;
            }
            // Caso recursivo: contar el dígito actual y llamar recursivamente con el resto del número
            else {
                return 1 + contarDigitos(numero / 10);
            }
        }
    }
