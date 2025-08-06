/*
8. Write a program that uses a JTextArea to enter multi-line text and a JButton to show the entered text in a dialog.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextArea Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        JButton button = new JButton("Show Text");

        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, textArea.getText(), "Entered Text", JOptionPane.INFORMATION_MESSAGE);
                }
            });

        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
