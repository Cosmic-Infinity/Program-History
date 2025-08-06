/*
21. Create a Swing program that uses a JTextField to accept a name
and display it in a JLabel when a JButton is clicked.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main21 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Name Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 1));

        JLabel promptLabel = new JLabel("Enter your name:", JLabel.CENTER);
        JTextField nameField = new JTextField();
        JButton showButton = new JButton("Show Name");
        JLabel nameLabel = new JLabel("", JLabel.CENTER);

        showButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String name = nameField.getText().trim();
                    if (!name.isEmpty()) {
                        nameLabel.setText("Hello, " + name + "!");
                    } else {
                        nameLabel.setText("Please enter a name.");
                    }
                }
            });

        frame.add(promptLabel);
        frame.add(nameField);
        frame.add(showButton);
        frame.add(nameLabel);
        frame.setVisible(true);
    }
}
