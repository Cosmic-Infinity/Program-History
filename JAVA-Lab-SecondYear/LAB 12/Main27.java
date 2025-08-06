/*
27. Write a program that demonstrates how to handle both ActionEvent and ItemEvent
for JRadioButton and JCheckBox.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main27 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Select options...", JLabel.CENTER);

        // JRadioButton example
        JRadioButton radioButton = new JRadioButton("Radio Button");
        radioButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    label.setText("ActionEvent: " + radioButton.getText() + " clicked");
                }
            });

        // JCheckBox example
        JCheckBox checkBox = new JCheckBox("Check Box");
        checkBox.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        label.setText("ItemEvent: " + checkBox.getText() + " checked");
                    } else {
                        label.setText("ItemEvent: " + checkBox.getText() + " unchecked");
                    }
                }
            });

        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(radioButton);
        panel.add(checkBox);

        frame.add(panel);
        frame.add(label);
        frame.setVisible(true);
    }
}
