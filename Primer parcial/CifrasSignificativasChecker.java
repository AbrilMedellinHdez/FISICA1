import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CifrasSignificativasChecker extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    public CifrasSignificativasChecker() {
        setTitle("Cifras Significativas Checker");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        inputField = new JTextField();
        JButton checkButton = new JButton("Verificar Cifras Significativas");
        resultLabel = new JLabel("Resultado:");

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCifrasSignificativas();
            }
        });

        panel.add(inputField);
        panel.add(checkButton);
        panel.add(resultLabel);

        add(panel, BorderLayout.CENTER);
    }

    private void checkCifrasSignificativas() {
        try {
            String input = inputField.getText().trim();

            // Regla 1: Dígitos diferentes de cero son cifras significativas
            int cifrasSignificativas = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isDigit(c) && c != '0') {
                    cifrasSignificativas++;
                }
            }

            // Regla 2: Ceros a la izquierda no son significativos
            int leadingZeros = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '0') {
                    leadingZeros++;
                } else {
                    break;
                }
            }
            cifrasSignificativas -= leadingZeros;

            // Regla 3: Ceros entre dos cifras significativas son significativos
            for (int i = 1; i < input.length() - 1; i++) {
                if (input.charAt(i) == '0' && Character.isDigit(input.charAt(i - 1))
                        && Character.isDigit(input.charAt(i + 1))) {
                    cifrasSignificativas++;
                }
            }

            // Regla 4: Ceros al final de la parte decimal son significativos
            if (input.contains(".")) {
                int decimalIndex = input.indexOf('.');
                for (int i = input.length() - 1; i > decimalIndex; i--) {
                    if (input.charAt(i) == '0') {
                        cifrasSignificativas++;
                    } else {
                        break;
                    }
                }
            }

            resultLabel.setText("Cifras Significativas: " + cifrasSignificativas);
        } catch (Exception ex) {
            resultLabel.setText("Entrada no válida");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CifrasSignificativasChecker().setVisible(true);
            }
        });
    }
}