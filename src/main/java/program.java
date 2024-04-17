// Java program using label (swing)
// to display the message “GFG Website Click”
import java.io.*;
import javax.swing.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating instance of JFrame
        JFrame frame = new JFrame();

        // Creating instance of JButton
        JButton button = new JButton(" GFG WebSite Click");

        // x-axis, y-axis, width, height
        button.setBounds(150, 200, 220, 50);

        // adding button in JFrame
        frame.add(button);

        // Width 400 and 500 height
        frame.setSize(500, 600);

        // using no layout managers
        frame.setLayout(null);

        // making the frame visible
        frame.setVisible(true);
    }
}
