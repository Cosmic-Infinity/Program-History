/*
4. Write a Swing application that creates a JRadioButton group with two buttons:
"Option 1" and "Option 2".
Display which option is selected when the button is clicked.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main4{
    public static void main(String[] args) {
        JFrame frame = new JFrame("APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(new GridLayout(3,1));

        JRadioButton r1 = new JRadioButton("Option 1");
        JRadioButton r2 = new JRadioButton("Option 2");
        ButtonGroup g1 = new ButtonGroup();
        g1.add(r1); g1.add(r2);
        JLabel l1 = new JLabel("Select an option!");

        ActionListener lis1 = new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(r1.isSelected())l1.setText("Option 1 selected");
                    else if(r2.isSelected())l1.setText("Option 2 selected");
                }
            };
        r1.addActionListener(lis1);
        r2.addActionListener(lis1);

        frame.add(l1);
        frame.add(r1);
        frame.add(r2);
        frame.setVisible(true);
    }
}