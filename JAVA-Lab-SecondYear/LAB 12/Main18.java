/*
18. Create a simple calculator using JTextField, JButton, and event handling
to perform basic addition, subtraction, multiplication, and division.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main18 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10)); // Better spacing for input fields
        JLabel label1 = new JLabel("Number 1:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Number 2:");
        JTextField textField2 = new JTextField();
        inputPanel.add(label1);
        inputPanel.add(textField1);
        inputPanel.add(label2);
        inputPanel.add(textField2);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10)); // Buttons arranged neatly
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("Divide");
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        JLabel resultLabel = new JLabel("Result: ", JLabel.CENTER); // Centered result label

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(resultLabel, BorderLayout.SOUTH);

        ActionListener listener = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        double num1 = Double.parseDouble(textField1.getText());
                        double num2 = Double.parseDouble(textField2.getText());
                        double result;

                        if (e.getSource() == addButton) {
                            result = num1 + num2;
                        } else if (e.getSource() == subtractButton) {
                            result = num1 - num2;
                        } else if (e.getSource() == multiplyButton) {
                            result = num1 * num2;
                        } else { // Divide Button
                            if (num2 == 0) {
                                JOptionPane.showMessageDialog(frame, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            result = num1 / num2;
                        }
                        resultLabel.setText("Result: " + result);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            };

        addButton.addActionListener(listener);
        subtractButton.addActionListener(listener);
        multiplyButton.addActionListener(listener);
        divideButton.addActionListener(listener);

        frame.setVisible(true);
    }
}
