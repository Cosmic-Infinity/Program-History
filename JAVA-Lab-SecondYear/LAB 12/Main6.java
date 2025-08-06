/*
6. Create a Swing application that uses a JComboBox to allow the user
to select a fruit and display a message with the selected fruit when a button is pressed.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fruit Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 1));

        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        JComboBox<String> comboBox = new JComboBox<>(fruits);
        JLabel label = new JLabel("Select a fruit...");
        JButton button = new JButton("Show Selected");

        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    label.setText("Selected: " + comboBox.getSelectedItem());
                }
            });

        frame.add(comboBox);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}
