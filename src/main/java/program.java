// Java program using label (swing)
// to display the message “GFG Website Click”
import java.awt.*;
import java.io.*;
import javax.swing.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        /*
        * Create frame object from JFrame class
            Create 3 button objects, from JButton class
                Setting different bounds, 2 are squared and 1 is rectangle
            Adding 3 buttons to the frame
                Setting size, layout, visibility to the frame
        * */

        JFrame frame = new JFrame("Word Counter");

        JButton button1 = new JButton("Click Here!");
        JButton button2 = new JButton("Click Here!");
        JButton button3 = new JButton("Click Here!");

        button1.setBounds(150,150,200,200);
        button2.setBounds(150,150,300,200);
        button3.setBounds(150,150,500,200);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setBounds(700,500, 500,500);
        frame.setVisible(true);
        frame.setLayout(null);

}
}

