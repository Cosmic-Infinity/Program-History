/*
7. Create a Swing JList with a list of items and display the selected item when a button is clicked.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Item Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(3, 1));

        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(items);
        JLabel label = new JLabel("Select an item...");
        JButton button = new JButton("Show Selected");

        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    label.setText("Selected: " + list.getSelectedValue());
                }
            });

        frame.add(new JScrollPane(list));
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}
