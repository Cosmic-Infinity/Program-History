/*
26. Design an application where the JComboBox changes the font size
of the text in a JLabel based on the selection, and an ActionEvent triggers the change.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main26 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Font Size Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Adjust my font size!", JLabel.CENTER);
        String[] fontSizes = {"12", "16", "20", "24", "28"};
        JComboBox<String> comboBox = new JComboBox<>(fontSizes);

        comboBox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int fontSize = Integer.parseInt((String) comboBox.getSelectedItem());
                    label.setFont(new Font("Arial", Font.PLAIN, fontSize));
                }
            });

        frame.add(label, BorderLayout.CENTER);
        frame.add(comboBox, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
