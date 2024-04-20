import java.io.*;
import java.util.*;

    public class ej11 {
        public static void buscarPalabraBinaria(File archivo, String palabraBuscada) {
            try {
                // Inicializar el contador de líneas
                int numeroLinea = 0;

                // Almacenar todas las líneas del archivo en una lista
                List<String> lineas = new ArrayList<>();
                BufferedReader reader = new BufferedReader(new FileReader(archivo));
                String linea;
                while ((linea = reader.readLine()) != null) {
                    lineas.add(linea);
                }
                reader.close();

                // Buscar la palabra en la lista de líneas utilizando búsqueda binaria
                int indice = Collections.binarySearch(lineas, palabraBuscada);

                if (indice >= 0) {
                    // Si la palabra se encuentra, calcular el número de línea correspondiente
                    numeroLinea = indice + 1;
                    System.out.println("La palabra '" + palabraBuscada + "' fue encontrada en la línea " + numeroLinea + ":");
                    System.out.println(lineas.get(indice));
                } else {
                    // Si la palabra no se encuentra, indicar que no se encontró
                    System.out.println("La palabra '" + palabraBuscada + "' no fue encontrada en el archivo.");
                }

            } catch (IOException e) {
                System.err.println("Error al procesar el archivo: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            File archivo = new File("archivo.txt"); // Nombre del archivo de texto
            String palabraBuscada = "palabra"; // Palabra que se desea buscar

            // Llamar al método para buscar la palabra en el archivo utilizando búsqueda binaria
            buscarPalabraBinaria(archivo, palabraBuscada);
        }
    }
