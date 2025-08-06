/*
14. Create a Swing application where a JButton click updates a JLabel to show the current time when pressed.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class Main14 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Time Updater");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(2, 1));

        JLabel label = new JLabel("Current Time: ", JLabel.CENTER);
        JButton button = new JButton("Update Time");

        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String currentTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
                    label.setText("Current Time: " + currentTime);
                }
            });

        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
}
