import java.awt.*;
import javax.swing.*;

public class LayoutTester{
    public void setFlowLayout() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Layout Tester");
        frame.setSize(350, 75);

        frame.setLayout(new FlowLayout());
        frame.add(new JButton("One"));
        frame.add(new JButton("Two"));
        frame.add(new JButton("Three"));
        frame.add(new JButton("Four"));
        frame.add(new JButton("Five"));

        frame.setVisible(true);
    }

    public void setGridLayout() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Layout Tester");
        frame.setSize(175, 125);

        frame.setLayout(new GridLayout(3, 3));

        frame.add(new JButton("One"));
        frame.add(new JButton("Two"));
        frame.add(new JButton("Three"));
        frame.add(new JButton("Four"));
        frame.add(new JButton("Five"));

        frame.setVisible(true);
    }

    public void setBorderLayout() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Layout Tester");
        JButton btn1 = new JButton("One");
        JButton btn2 = new JButton("Five");
        JButton btn3 = new JButton("Three");
        JButton btn4 = new JButton("Two");
        JButton btn5 = new JButton("Four");

        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.SOUTH);
        frame.add(btn3, BorderLayout.CENTER);
        frame.add(btn4, BorderLayout.WEST);
        frame.add(btn5, BorderLayout.EAST);

        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        LayoutTester l1 = new LayoutTester();
        l1.setFlowLayout();
        l1.setGridLayout();
        l1.setBorderLayout();
    }
}