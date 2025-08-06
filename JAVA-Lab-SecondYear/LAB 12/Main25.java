/*
25. Create a Swing program that listens to an ActionEvent for a JButton
and changes the background color of the JFrame.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main25 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Background Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Change Background");

        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Change the background color randomly
                    frame.getContentPane().setBackground(new Color(
                            (int) (Math.random() * 256), 
                            (int) (Math.random() * 256), 
                            (int) (Math.random() * 256)
                        ));
                }
            });

        frame.add(button);
        frame.setVisible(true);
    }
}
