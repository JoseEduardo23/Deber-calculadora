import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CALCULADORA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para cerrar el frame
        frame.setContentPane(new Plana().MainPanel);
        frame.setSize(800, 600);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setVisible(true);
    }
}