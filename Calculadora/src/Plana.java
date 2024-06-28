import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Plana {
    public JTextField textField1;
    public JButton Multiplica;
    public JButton Resta;
    public JButton Suma;
    public JButton Divide;
    public JButton Raiz;
    public JButton Elevado;
    public JButton Coseno;
    public JButton Tangente;
    public JButton Seno;
    public JTextField Numero1;
    public JTextField Numero2;
    public JPanel MainPanel;

    public boolean isValidInput(String input) {
        try {
            // Usar trim() para eliminar espacios en blanco
            Double.parseDouble(input.trim());
            return true; // La conversión a Double fue exitosa, por lo tanto, es válido
        } catch (NumberFormatException e) {
            return false; // Hubo una excepción al intentar convertir, no es válido
        }
    }

    public Plana() {
        Suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValidInput(Numero1.getText()) && isValidInput(Numero2.getText())) {
                    double num1 = Double.parseDouble(Numero1.getText().trim());
                    double num2 = Double.parseDouble(Numero2.getText().trim());
                    double resultado = num1 + num2;
                    textField1.setText(Double.toString(resultado));
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos en ambos campos.");
                }
            }
        });

        Resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValidInput(Numero1.getText()) && isValidInput(Numero2.getText())) {
                    double num1 = Double.parseDouble(Numero1.getText().trim());
                    double num2 = Double.parseDouble(Numero2.getText().trim());
                    double resultado = num1 - num2;
                    textField1.setText(Double.toString(resultado));
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos en ambos campos.");
                }
            }
        });

        Multiplica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValidInput(Numero1.getText()) && isValidInput(Numero2.getText())) {
                    double num1 = Double.parseDouble(Numero1.getText().trim());
                    double num2 = Double.parseDouble(Numero2.getText().trim());
                    double resultado = num1 * num2;
                    textField1.setText(Double.toString(resultado));
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos en ambos campos.");
                }
            }
        });

        Divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValidInput(Numero1.getText()) && isValidInput(Numero2.getText())) {
                    double num1 = Double.parseDouble(Numero1.getText().trim());
                    double num2 = Double.parseDouble(Numero2.getText().trim());
                    if (num2 == 0 || num1 ==0) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.");
                    } else {
                        double resultado = num1 / num2;
                        textField1.setText(Double.toString(resultado));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos en ambos campos.");
                }
            }
        });

        Raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValidInput(Numero1.getText())) {
                    double num = Double.parseDouble(Numero1.getText().trim());
                    if (num >= 0) {
                        double resultado = Math.sqrt(num);
                        textField1.setText(Double.toString(resultado));
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el campo.");
                }
            }
        });

        Elevado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValidInput(Numero1.getText()) && isValidInput(Numero2.getText())) {
                    double base = Double.parseDouble(Numero1.getText().trim());
                    double exponente = Double.parseDouble(Numero2.getText().trim());
                    double resultado = Math.pow(base, exponente);
                    textField1.setText(Double.toString(resultado));
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos en ambos campos.");
                }
            }
        });

        Coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValidInput(Numero1.getText())) {
                    double num = Double.parseDouble(Numero1.getText().trim());
                    double resultado = Math.cos(Math.toRadians(num));
                    textField1.setText(Double.toString(resultado));
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el campo.");
                }
            }
        });

        Tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValidInput(Numero1.getText())) {
                    double num = Double.parseDouble(Numero1.getText().trim());
                    double resultado = Math.tan(Math.toRadians(num));
                    textField1.setText(Double.toString(resultado));
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el campo.");
                }
            }
        });

        Seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValidInput(Numero1.getText())) {
                    double num = Double.parseDouble(Numero1.getText().trim());
                    double resultado = Math.sin(Math.toRadians(num));
                    textField1.setText(Double.toString(resultado));
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el campo.");
                }
            }
        });

        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoCampo = textField1.getText().trim();
                if (textoCampo.equalsIgnoreCase("suma")) {
                    Suma.doClick();
                } else if (textoCampo.equalsIgnoreCase("resta")) {
                    Resta.doClick();
                } else if (textoCampo.equalsIgnoreCase("multiplica")) {
                    Multiplica.doClick();
                } else if (textoCampo.equalsIgnoreCase("divide")) {
                    Divide.doClick();
                } else {
                    JOptionPane.showMessageDialog(null, "Comando no reconocido.");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Plana().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}