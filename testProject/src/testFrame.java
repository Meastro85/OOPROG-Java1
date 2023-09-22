import javax.swing.*;
import java.awt.*;

/**
 * Vincent Verboven
 * 19/10/2022
 */
public class testFrame {
    public static void main(String[] args) {
        JFrame Frame = new JFrame("Testing Frame");
        testPanel Panel = new testPanel();
        Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Frame.add(Panel);
        Frame.pack();
        Frame.setLocationRelativeTo(null);
        Frame.setVisible(true);
        Frame.setResizable(false);
    }
}
