/*
2. Write a Swing program that creates a JTextField where the user can type a name and
a JButton that, when clicked, updates the JLabel to greet the entered name.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Main2{
    public static void main(String[] args) {
        JFrame frame = new JFrame("TITLE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3,1));

        JTextField txt1 = new JTextField();
        JButton b1 = new JButton("Click ME!");
        JLabel l1 = new JLabel("Wait for it...", SwingConstants.CENTER);
        b1.addActionListener(new ActionListener()  {
                public void actionPerformed(ActionEvent e) {l1.setText("Hello "+txt1.getText());}
            });
        frame.add(txt1);
        frame.add(b1);
        frame.add(l1);
        frame.setVisible(true);
    }
}