package Lesson_8;

import javax.swing.*;
import java.awt.*;

public class BottomFrame {
    private final JPanel panel;
    public BottomFrame() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 3));
        for (int i = 0; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            panel.add(btn);
        }

        panel.add(new JButton("="));
        panel.add(new JButton("C"));
        panel.add(new JButton("+"));
        panel.add(new JButton("-"));
        panel.add(new JButton("SQRT"));

    }

    public JPanel getPanel() {
        return panel;
    }
}
