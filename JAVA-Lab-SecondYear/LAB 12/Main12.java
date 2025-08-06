/*
12. Design a Swing application that uses JTabbedPane to display two different panels:
one for text input and another for displaying the selected items from a list.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Text Input Panel
        JPanel textPanel = new JPanel(new BorderLayout());
        JTextArea textArea = new JTextArea();
        JButton showTextButton = new JButton("Show Text");
        showTextButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, textArea.getText(), "Entered Text", JOptionPane.INFORMATION_MESSAGE);
                }
            });
        textPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        textPanel.add(showTextButton, BorderLayout.SOUTH);

        // List Selection Panel
        JPanel listPanel = new JPanel(new BorderLayout());
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(items);
        JLabel selectedItemLabel = new JLabel("Selected Item: None");
        JButton showSelectionButton = new JButton("Show Selection");
        showSelectionButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    selectedItemLabel.setText("Selected Item: " + list.getSelectedValue());
                }
            });
        listPanel.add(new JScrollPane(list), BorderLayout.CENTER);
        listPanel.add(showSelectionButton, BorderLayout.SOUTH);
        listPanel.add(selectedItemLabel, BorderLayout.NORTH);

        // Adding panels to the tabbed pane
        tabbedPane.add("Text Input", textPanel);
        tabbedPane.add("List Selection", listPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
