/*
28. Create a JButton and implement an ActionListener to toggle
the visibility of a JLabel when the button is clicked.
 */
import javax.swing.*;
import java.awt.event.*;

class Main28 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Toggle Visibility Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null); // Using null layout for precise positioning

        JLabel label = new JLabel("Toggle me!");
        label.setBounds(100, 50, 100, 30); // Set label position and size

        JButton button = new JButton("Toggle Visibility");
        button.setBounds(80, 100, 140, 30); // Set button position and size

        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    label.setVisible(!label.isVisible()); // Toggle visibility
                }
            });

        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
}
