import java.io.*;
import java.util.*;

    public class ej10 {
        public static void buscarPalabra(File archivo, String palabraBuscada) {
            try {
                // Inicializar el contador de líneas
                int numeroLinea = 0;

                // Leer el archivo línea por línea
                BufferedReader reader = new BufferedReader(new FileReader(archivo));
                String linea;
                while ((linea = reader.readLine()) != null) {
                    numeroLinea++; // Incrementar el contador de líneas

                    // Buscar la palabra en la línea actual
                    if (linea.contains(palabraBuscada)) {
                        System.out.println("La palabra '" + palabraBuscada + "' fue encontrada en la línea " + numeroLinea + ":");
                        System.out.println(linea);
                        System.out.println(); // Imprimir una línea en blanco para separar las coincidencias
                    }
                }
                reader.close();

            } catch (IOException e) {
                System.err.println("Error al procesar el archivo: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            File archivo = new File("archivo.txt"); // Nombre del archivo de texto
            String palabraBuscada = "palabra"; // Palabra que se desea buscar

            // Llamar al método para buscar la palabra en el archivo
            buscarPalabra(archivo, palabraBuscada);
        }
    }
