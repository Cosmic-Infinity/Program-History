/*
15. Write a Swing application that creates a JButton.
When clicked, it should show a dialog with a custom message.
 */
import javax.swing.*;
import java.awt.event.*;

class Main15 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Dialog Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "Hello! This is a custom message.", "Custom Message", JOptionPane.INFORMATION_MESSAGE);
                }
            });

        frame.add(button);
        frame.setVisible(true);
    }
}
