public class ej8 {
        public static int contarGenes(String cadenaADN) {
            int contadorGenes = 0;
            int indice = 0;

            while (indice < cadenaADN.length()) {
                // Buscar la próxima ocurrencia de la secuencia "ATG"
                int inicioGen = cadenaADN.indexOf("ATG", indice);

                if (inicioGen == -1) {
                    // Si no se encuentra más "ATG", salir del bucle
                    break;
                }

                // Buscar el final del gen
                int finGen = encontrarFinGen(cadenaADN, inicioGen + 3);

                if (finGen != -1) {
                    // Se ha encontrado el final del gen
                    contadorGenes++;
                    // Actualizar el índice para continuar la búsqueda desde después del gen actual
                    indice = finGen;
                } else {
                    // Si no se encuentra el final del gen, continuar la búsqueda desde después de "ATG"
                    indice = inicioGen + 3;
                }
            }

            return contadorGenes;
        }

        private static int encontrarFinGen(String cadenaADN, int inicio) {
            // Secuencias de fin de gen
            String[] secuenciasFinGen = {"TAA", "TAG", "TGA"};

            for (String secuencia : secuenciasFinGen) {
                int fin = cadenaADN.indexOf(secuencia, inicio);
                if (fin != -1 && (fin - inicio) % 3 == 0) {
                    // Si se encuentra una secuencia de fin de gen y la longitud del gen es un múltiplo de 3
                    return fin + 3; // Devolver el índice después de la secuencia de fin de gen
                }
            }

            return -1; // No se encontró un final de gen válido
        }
    }
