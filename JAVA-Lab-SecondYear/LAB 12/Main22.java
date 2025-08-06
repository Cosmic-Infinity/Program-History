/*
22. Write a program that demonstrates how to handle ActionEvent using an anonymous class.
Create a button that changes its text when clicked.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main22 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anonymous Class Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click Me");

        // Using an anonymous class to handle the ActionEvent
        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    button.setText("Clicked!");
                }
            });

        frame.add(button);
        frame.setVisible(true);
    }
}
