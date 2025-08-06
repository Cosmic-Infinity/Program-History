/*
17. Create a program where the user clicks a JCheckBox.
Based on whether it's checked or unchecked, update the text of a JLabel.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main17 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(2, 1));

        JLabel label = new JLabel("CheckBox is unchecked", JLabel.CENTER);
        JCheckBox checkBox = new JCheckBox("Click Me");

        checkBox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (checkBox.isSelected()) {
                        label.setText("CheckBox is checked");
                    } else {
                        label.setText("CheckBox is unchecked");
                    }
                }
            });

        frame.add(label);
        frame.add(checkBox);
        frame.setVisible(true);
    }
}
