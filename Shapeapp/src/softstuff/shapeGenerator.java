package softstuff;
import javax.swing.*;
public class shapeGenerator {

    public final static int WIDTH = 10;
    public final static int HEIGHT = 20;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Display Shapes");
        MyPanel display = new MyPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(display);
        frame.setSize(1100, 1200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

} 