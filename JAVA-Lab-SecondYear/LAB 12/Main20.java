/*
20. Write a program that uses JComboBox to change the background color of a JFrame
based on the selected color from the drop-down list.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main20 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        String[] colors = {"Red", "Green", "Blue", "Yellow", "White"};
        JComboBox<String> comboBox = new JComboBox<>(colors);

        comboBox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String selectedColor = (String) comboBox.getSelectedItem();
                    switch (selectedColor) {
                        case "Red":
                            frame.getContentPane().setBackground(Color.RED);
                            break;
                        case "Green":
                            frame.getContentPane().setBackground(Color.GREEN);
                            break;
                        case "Blue":
                            frame.getContentPane().setBackground(Color.BLUE);
                            break;
                        case "Yellow":
                            frame.getContentPane().setBackground(Color.YELLOW);
                            break;
                        case "White":
                            frame.getContentPane().setBackground(Color.WHITE);
                            break;
                    }
                }
            });

        frame.add(comboBox);
        frame.setVisible(true);
    }
}
