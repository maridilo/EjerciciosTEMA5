import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        // Nuevo Frame
        JFrame frame = new JFrame("Suma numeros naturales");
frame.setSize(400, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocationRelativeTo(null);

JPanel panel = new JPanel();
frame.add(panel);

JLabel label = new JLabel("Ingrese el numero hasta el cual desea calcular la suma:");
panel.add(label);

JTextField textField = new JTextField(10);
panel.add(textField);

JButton button = new JButton("Calcular");
panel.add(button);

JTextArea textArea = new JTextArea(5, 20);
panel.add(textArea);

button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(textField.getText());
        int suma = ej1.sumNaturales(n);
        textArea.setText("La suma de los primeros " + n + "numeros naturales es: " + suma);
    }
});

        frame.setVisible(true);
    }
}
