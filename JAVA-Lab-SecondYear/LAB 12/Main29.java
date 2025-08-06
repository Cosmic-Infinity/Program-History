/*
29. Create a program with a JComboBox and a JLabel.
When the user selects an item from the combo box, display the item in the label.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main29 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Selected Item: None", JLabel.CENTER);
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JComboBox<String> comboBox = new JComboBox<>(items);

        comboBox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    label.setText("Selected Item: " + comboBox.getSelectedItem());
                }
            });

        frame.add(comboBox, BorderLayout.NORTH);
        frame.add(label, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
