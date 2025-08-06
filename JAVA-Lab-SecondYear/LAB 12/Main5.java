/*
5. Write a Swing program that demonstrates the use of a JCheckBox.
Show whether the checkbox is checked or unchecked when a JButton is clicked.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main5{
    public static void main(String[] args) {
        JFrame frame = new JFrame("APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(new GridLayout(3,1));

        JCheckBox c1 = new JCheckBox("Check Box");
        JLabel l1 = new JLabel("Select!");
        JButton b1 = new JButton("Check");

        ActionListener lis1 = new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(c1.isSelected())l1.setText("CheckBox selected");
                    else l1.setText("CheckBox NOT selected");
                }
            };
        b1.addActionListener(lis1);

        frame.add(l1);
        frame.add(c1);
        frame.add(b1);
        frame.setVisible(true);
    }
}