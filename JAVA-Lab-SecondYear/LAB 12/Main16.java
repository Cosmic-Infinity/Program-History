/*
16. Design an event handling system where clicking on a JRadioButton
triggers a JLabel to change its text based on the selected option.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main16 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RadioButton Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Choose an option...", JLabel.CENTER);

        JRadioButton option1 = new JRadioButton("Option 1");
        JRadioButton option2 = new JRadioButton("Option 2");
        JRadioButton option3 = new JRadioButton("Option 3");

        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);

        ActionListener listener = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    label.setText("Selected: " + ((JRadioButton) e.getSource()).getText());
                }
            };

        option1.addActionListener(listener);
        option2.addActionListener(listener);
        option3.addActionListener(listener);

        JPanel radioPanel = new JPanel(new GridLayout(1, 3));
        radioPanel.add(option1);
        radioPanel.add(option2);
        radioPanel.add(option3);

        frame.add(radioPanel);
        frame.add(label);
        frame.setVisible(true);
    }
}
