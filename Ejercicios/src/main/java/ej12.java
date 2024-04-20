import java.util.*;
import java.text.*;

    public class ej12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<Date> fechas = new ArrayList<>();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            // Solicitar al usuario introducir las fechas
            System.out.println("Introduce las fechas en formato dd/MM/yyyy (ingresa 'fin' para terminar):");
            while (true) {
                System.out.print("> ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("fin")) {
                    break;
                }

                try {
                    Date fecha = dateFormat.parse(input);
                    fechas.add(fecha);
                } catch (ParseException e) {
                    System.out.println("Formato de fecha incorrecto. Inténtalo de nuevo.");
                }
            }

            // Ordenar las fechas cronológicamente
            Collections.sort(fechas);

            // Imprimir las fechas ordenadas
            System.out.println("\nFechas ordenadas cronológicamente:");
            for (Date fecha : fechas) {
                System.out.println(dateFormat.format(fecha));
            }

            scanner.close();
        }
    }
