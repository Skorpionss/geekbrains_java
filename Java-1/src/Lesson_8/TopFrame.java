package Lesson_8;

import javax.swing.*;
import java.awt.*;

public class TopFrame {
    private final JPanel panel;
    public TopFrame() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JTextField inputField = new JTextField();
        inputField.setEditable(false);
        panel.add(inputField, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }
}
