package Lesson_8;

import javax.swing.*;
import java.awt.*;


public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        setTitle("Calculator v 1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(10, 10, 300, 500);

        setLayout(new BorderLayout());

        TopFrame top = new TopFrame();
        add(top.getPanel(), BorderLayout.NORTH);

        BottomFrame button = new BottomFrame(top.getInputField());
        add(button.getPanel(), BorderLayout.CENTER);


        setVisible(true);
    }
}
