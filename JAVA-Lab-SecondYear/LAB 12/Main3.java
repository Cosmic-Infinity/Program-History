/*
3. Create a JButton with a different background color and text color and add it to a JPanel.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Main3{
    public static void main(String[] args) {
        JFrame frame = new JFrame("App Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
        frame.setSize(300,300);
        JPanel panel = new JPanel();
        frame.add(panel);

        JButton b1 = new JButton("OK");
        b1.setBackground(Color.cyan);
        b1.setForeground(Color.red);

        frame.add(b1);
        frame.setVisible(true);
    }
}