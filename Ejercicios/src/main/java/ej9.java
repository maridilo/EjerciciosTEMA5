import java.io.*;
import java.util.*;

    public class ej9 {
        public static void ordenarArchivo(File archivoEntrada, File archivoSalida) {
            try {
                // Leer las líneas del archivo de entrada y almacenarlas en una lista
                List<String> lineas = new ArrayList<>();
                BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
                String linea;
                while ((linea = reader.readLine()) != null) {
                    lineas.add(linea);
                }
                reader.close();

                // Ordenar las líneas alfabéticamente
                Collections.sort(lineas);

                // Escribir las líneas ordenadas en el archivo de salida
                BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida));
                for (String lineaOrdenada : lineas) {
                    writer.write(lineaOrdenada);
                    writer.newLine();
                }
                writer.close();

                System.out.println("El archivo ha sido ordenado correctamente.");

            } catch (IOException e) {
                System.err.println("Error al procesar el archivo: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            File archivoEntrada = new File("archivo_entrada.txt"); // Nombre del archivo de entrada
            File archivoSalida = new File("archivo_salida.txt"); // Nombre del archivo de salida

            // Llamar al método para ordenar el archivo de entrada y generar el archivo de salida
            ordenarArchivo(archivoEntrada, archivoSalida);
        }
    }
