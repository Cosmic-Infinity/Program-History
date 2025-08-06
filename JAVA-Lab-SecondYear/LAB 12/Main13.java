/*
13. Write a program to demonstrate the Delegation Event Model.
Create a JButton that fires an event when clicked, and handle the event in a separate listener class.
 */
import javax.swing.*;
import java.awt.event.*;

// Listener class implementing ActionListener
class ButtonClickListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }
}

public class Main13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Delegation Event Model Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click Me");
        button.addActionListener(new ButtonClickListener()); // Adding listener

        frame.add(button);
        frame.setVisible(true);
    }
}
