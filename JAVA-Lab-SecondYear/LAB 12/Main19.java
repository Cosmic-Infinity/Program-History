/*
19. Design a program where clicking a JButton adds items to a JList.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Main19 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Item Adder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> list = new JList<>(listModel);
        JTextField textField = new JTextField();
        JButton addButton = new JButton("Add Item");

        addButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String newItem = textField.getText().trim();
                    if (!newItem.isEmpty()) {
                        listModel.addElement(newItem);
                        textField.setText(""); // Clear the text field after adding
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please enter a valid item.", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }
            });

        frame.add(new JScrollPane(list), BorderLayout.CENTER);
        frame.add(textField, BorderLayout.NORTH);
        frame.add(addButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
