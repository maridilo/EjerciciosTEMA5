import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Nuevo Frame
        JFrame frame = new JFrame("Ejercicios:");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);

        String[] ejercicios = {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3","Ejercicio 4","Ejercicio 5"};
        JComboBox<String> comboBox = new JComboBox<>(ejercicios);
        panel.add(comboBox);

        JLabel labelN = new JLabel("Ingrese el numero hasta el cual desea calcular la suma:");
        JTextField textFieldN = new JTextField(10);
        panel.add(labelN);
        panel.add(textFieldN);
        textFieldN.setVisible(false);

        // Labels y campos de texto para los valores de entrada
        JLabel labelA = new JLabel("Valor de a:");
        JTextField textFieldA = new JTextField(5);
        panel.add(labelA);
        panel.add(textFieldA);
        textFieldA.setVisible(false);

        JLabel labelD = new JLabel("Valor de d:");
        JTextField textFieldD = new JTextField(5);
        panel.add(labelD);
        panel.add(textFieldD);
        textFieldD.setVisible(false);

        JLabel labelNumero = new JLabel("Ingrese un número entero:");
        JTextField textFieldNumero = new JTextField(10);
        panel.add(labelNumero);
        panel.add(textFieldNumero);
        labelNumero.setVisible(false);
        textFieldNumero.setVisible(false);

        JLabel labelX = new JLabel("Valor de x:");
        JTextField textFieldX = new JTextField(5);
        panel.add(labelX);
        panel.add(textFieldX);
        textFieldX.setVisible(false);

        JLabel labelY = new JLabel("Valor de y:");
        JTextField textFieldY = new JTextField(5);
        panel.add(labelY);
        panel.add(textFieldY);
        textFieldY.setVisible(false);

        JLabel labelVector = new JLabel("Ingrese los valores del vector (separados por comas):");
        JTextField textFieldVector = new JTextField(20);
        panel.add(labelVector);
        panel.add(textFieldVector);
        textFieldVector.setVisible(false);

    JButton button = new JButton("Calcular");
    panel.add(button);

    JTextArea textArea = new JTextArea(5, 20);
    panel.add(textArea);

        // Acción del JComboBox para mostrar los campos de entrada adecuados según el ejercicio seleccionado
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ejercicioSeleccionado = comboBox.getSelectedIndex();

                // Mostrar u ocultar los campos de entrada según el ejercicio seleccionado
                switch (ejercicioSeleccionado) {
                    case 0: // Ej1
                    labelN.setVisible(true);
                    textFieldN.setVisible(true);
                    labelA.setVisible(false);
                    textFieldA.setVisible(false);
                    labelD.setVisible(false);
                    textFieldD.setVisible(false);
                    labelNumero.setVisible(false);
                    textFieldNumero.setVisible(false);
                    labelX.setVisible(false);
                    textFieldX.setVisible(false);
                    labelY.setVisible(false);
                    textFieldY.setVisible(false);
                    labelVector.setVisible(false);
                    textFieldVector.setVisible(false);
                    break;
                    case 1:
                    labelN.setVisible(false);
                    textFieldN.setVisible(false);
                    labelA.setVisible(true);
                    textFieldA.setVisible(true);
                    labelD.setVisible(true);
                    textFieldD.setVisible(true);
                    labelNumero.setVisible(false);
                    textFieldNumero.setVisible(false);
                    labelX.setVisible(false);
                    textFieldX.setVisible(false);
                    labelY.setVisible(false);
                    textFieldY.setVisible(false);
                    labelVector.setVisible(false);
                    textFieldVector.setVisible(false);
                    break;
                    case 2:
                labelN.setVisible(false);
                textFieldN.setVisible(false);
                labelA.setVisible(false);
                textFieldA.setVisible(false);
                labelD.setVisible(false);
                textFieldD.setVisible(false);
                labelNumero.setVisible(true);
                textFieldNumero.setVisible(true);
                labelX.setVisible(false);
                textFieldX.setVisible(false);
                labelY.setVisible(false);
                textFieldY.setVisible(false);
                labelVector.setVisible(false);
                textFieldVector.setVisible(false);
                break;
                    case 3:
                        labelN.setVisible(false);
                        textFieldN.setVisible(false);
                        labelA.setVisible(false);
                        textFieldA.setVisible(false);
                        labelD.setVisible(false);
                        textFieldD.setVisible(false);
                        labelNumero.setVisible(false);
                        textFieldNumero.setVisible(false);
                        labelX.setVisible(true);
                        textFieldX.setVisible(true);
                        labelY.setVisible(true);
                        textFieldY.setVisible(true);
                        labelVector.setVisible(false);
                        textFieldVector.setVisible(false);
                        break;
                    case 4:
                        labelN.setVisible(false);
                        textFieldN.setVisible(false);
                        labelA.setVisible(false);
                        textFieldA.setVisible(false);
                        labelD.setVisible(false);
                        textFieldD.setVisible(false);
                        labelNumero.setVisible(false);
                        textFieldNumero.setVisible(false);
                        labelX.setVisible(false);
                        textFieldX.setVisible(false);
                        labelY.setVisible(false);
                        textFieldY.setVisible(false);
                        labelVector.setVisible(true);
                        textFieldVector.setVisible(true);
                    default:
                        break;
                }
            }
        });
button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int ejercicioSeleccionado = comboBox.getSelectedIndex();
        switch (ejercicioSeleccionado) {
            case 0: // Ejercicio 1
                int n = Integer.parseInt(textFieldN.getText());
                int resultado1 = ej1.sumNaturales(n);
                textArea.setText("La suma de los primeros " + n + " números naturales es: " + resultado1);
                break;
            case 1: // Ejercicio 2
                int a = Integer.parseInt(textFieldA.getText());
                int d = Integer.parseInt(textFieldD.getText());
                textArea.setText("");
                imprimirNumerosNaturales(a, d, textArea);
                break;
            case 2: // Ejercicio 3
                int numero = Integer.parseInt(textFieldNumero.getText());
                int cantidadDigitos = ej3.contarDigitos(numero);
                textArea.setText("La cantidad de dígitos del número " + numero + " es: " + cantidadDigitos);
                break;
            case 3: // Ejercicio 4
                int x = Integer.parseInt(textFieldX.getText());
                int y = Integer.parseInt(textFieldY.getText());
                int resultado4 = ej4.calcularPotencia(x, y);
                textArea.setText("El resultado de " + x + "^" + y + " es: " + resultado4);
                break;
            case 4: // Ejercicio 5
                String[] valores = textFieldVector.getText().split(",");
                int[] vector = new int[valores.length];
                for (int i = 0; i < valores.length; i++) {
                    vector[i] = Integer.parseInt(valores[i]);
                }
                int maximo = ej5.calcularMaximo(vector, 0, vector.length - 1);
                textArea.setText("El valor máximo del vector es: " + maximo);
                break;
            default:
                break;
        }
    }
});
        frame.setVisible(true);
    }

    // Función recursiva para imprimir la lista de números naturales entre a y d
    public static void imprimirNumerosNaturales(int a, int d, JTextArea textArea) {
        if (a <= d) {
            textArea.append(a + " ");
            imprimirNumerosNaturales(a + 1, d, textArea);
        }
    }
}
