/*
11. Create a JTable with at least 3 rows and 3 columns, and display it in a JScrollPane.
 */
import javax.swing.*;
import java.awt.*;

class Main11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        String[][] data = {
                {"r1c1", "r1c2", "r1c3"},
                {"r2c1", "r2c2", "r2c3"},
                {"r3c1", "r3c2", "r3c3"}
            };

        String[] columnNames = {"Column1", "Column2", "Column3"};
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
