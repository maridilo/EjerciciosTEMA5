import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        // Nuevo Frame
        JFrame frame = new JFrame("Suma numeros naturales");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero hasta el cual desea calcular la suma de los numeros naturales");
        int n = scanner.nextInt();
        // Llamada a la funcion sumNaturales
        int suma = ej1.sumNaturales(n);
        System.out.println("La suma de los primeros " + n + "numeros naturales es: " + suma);
        scanner.close();
    }
}
