/*
1. Create a basic Swing application with a JFrame and a JLabel that displays a greeting message.
 */
import javax.swing.*;
import java.awt.*;
class Main1{
    public static void main(String[] args) {
        JFrame frame = new JFrame("TITLE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(2,1));

        JLabel label = new JLabel("Hello hello!", SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.BOTTOM);
        JLabel label2 = new JLabel("This is swiging!", SwingConstants.CENTER);
        frame.add(label);
        frame.add(label2);
        frame.setVisible(true);
    }
}