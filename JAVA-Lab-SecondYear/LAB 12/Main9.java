/*
9. Create a JSlider that allows the user to select a value between 0 and 100.
Display the selected value when a button is clicked.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Slider Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 1));

        JSlider slider = new JSlider(0, 100, 50); // Initial value set to 50
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JLabel label = new JLabel("Selected Value: " + slider.getValue());
        JButton button = new JButton("Show Value");

        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    label.setText("Selected Value: " + slider.getValue());
                }
            });

        frame.add(slider);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}
