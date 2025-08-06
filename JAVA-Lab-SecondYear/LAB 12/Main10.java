/*
10. Write a Swing program with a JSpinner for selecting a number between 1 and 10
and a button to display the selected number.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Number Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 1));

        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 10, 1); // Initial value 1, range 1–10, step 1
        JSpinner spinner = new JSpinner(model);
        JLabel label = new JLabel("Selected Number: " + model.getValue());
        JButton button = new JButton("Show Number");

        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    label.setText("Selected Number: " + spinner.getValue());
                }
            });

        frame.add(spinner);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}
