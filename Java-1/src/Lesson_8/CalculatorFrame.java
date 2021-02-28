package Lesson_8;

import javax.swing.*;
import java.awt.*;


public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        setTitle("Calculator v 1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(10, 10, 300, 500);

        setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JTextField inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField, BorderLayout.CENTER);
        add(top, BorderLayout.NORTH);

        JPanel button = new JPanel();
        button.setLayout(new GridLayout(5, 3));
        for (int i = 0; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            button.add(btn);
        }
        add(button, BorderLayout.CENTER);

        button.add(new JButton("="));
        button.add(new JButton("C"));
        button.add(new JButton("+"));
        button.add(new JButton("-"));
        button.add(new JButton("SQRT"));

        setVisible(true);
    }
}
