/*
30. Write a program that demonstrates the use of an adapter class (MouseAdapter)
to detect mouse clicks in a JPanel and display the mouse click location.
 */
import javax.swing.*;
import java.awt.event.*;

class Main30 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseAdapter Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Click anywhere on the panel!");

        panel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    int x = e.getX();
                    int y = e.getY();
                    label.setText("Mouse clicked at: (" + x + ", " + y + ")");
                }
            });

        panel.setLayout(null);
        label.setBounds(10, 10, 300, 30); // Position the label
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);
    }
}
