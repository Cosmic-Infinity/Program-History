/*
24. Write a program that displays an ActionEvent message
when a JTextField is submitted (on pressing "Enter").
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Main24 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField Submit Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField();
        JLabel label = new JLabel("Press Enter after typing...", JLabel.CENTER);

        textField.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    label.setText("You entered: " + textField.getText());
                }
            });

        frame.setLayout(new BorderLayout());
        frame.add(textField, BorderLayout.NORTH);
        frame.add(label, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
