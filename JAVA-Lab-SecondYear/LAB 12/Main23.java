/*
23. Create a JButton and implement an ActionListener
that prints "Button clicked!" every time the button is pressed.
 */
import javax.swing.*;
import java.awt.event.*;

class Main23 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button clicked!");
                }
            });

        frame.add(button);
        frame.setVisible(true);
    }
}
