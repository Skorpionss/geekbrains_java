package Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomFrame {
    private final JPanel panel;
    private int left;
    private int right;
    private String operacia;
    private boolean ptochka;
    private double dleft;
    private double dright;

    public BottomFrame(JTextField inputField) {
        panel = new JPanel();
        panel.setLayout(new GridLayout(6, 3));

        DigitButtonListener buttonListener = new DigitButtonListener(inputField);

        for (int i = 0; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(buttonListener);
            panel.add(btn);
        }

        JButton ravno = new JButton("=");
        ravno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (ptochka) {

                    dright = Double.parseDouble(inputField.getText());
                    switch (operacia) {
                        case ("+"):
                            inputField.setText(String.valueOf(dleft + dright));
                            break;
                        case ("-"):
                            inputField.setText(String.valueOf(dleft - dright));
                            break;
                        case ("/"):
                            inputField.setText(String.valueOf(dleft / dright));
                            break;
                        case ("*"):
                            inputField.setText(String.valueOf(dleft * dright));
                            break;
                    }

                } else {



                right = Integer.parseInt(inputField.getText());
                switch (operacia) {
                    case ("+"):
                        inputField.setText(String.valueOf(left + right));
                        break;
                    case ("-"):
                        inputField.setText(String.valueOf(left - right));
                        break;
                    case ("/"):
                        inputField.setText(String.valueOf(left / right));
                        break;
                    case ("*"):
                        inputField.setText(String.valueOf(left * right));
                        break;
                }

            }
            }
        });
        panel.add(ravno);


        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
                left = 0;
                ptochka = false;
            }
        });
        panel.add(clear);

        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ptochka){
                    dleft = Double.parseDouble(inputField.getText());
                }
                else {
                    left = Integer.parseInt(inputField.getText());
                }

                inputField.setText("");
                operacia = "+";
            }
        });
        panel.add(plus);

        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (ptochka){
                    dleft = Double.parseDouble(inputField.getText());
                }
                else {
                    left = Integer.parseInt(inputField.getText());
                }

                inputField.setText("");
                operacia = "-";
            }
        });
        panel.add(minus);

        panel.add(new JButton("SQRT"));

        JButton delim = new JButton("/");
        delim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ptochka){
                    dleft = Double.parseDouble(inputField.getText());
                }
                else {
                    left = Integer.parseInt(inputField.getText());
                }

                inputField.setText("");
                operacia = "/";
            }
        });
        panel.add(delim);

        JButton umnoshit = new JButton("*");
        umnoshit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ptochka){
                    dleft = Double.parseDouble(inputField.getText());
                }
                else {
                    left = Integer.parseInt(inputField.getText());
                }

                inputField.setText("");
                operacia = "*";
            }
        });
        panel.add(umnoshit);

        JButton zapitai = new JButton(",");
        zapitai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                left = Integer.parseInt(inputField.getText());
                inputField.setText(left + ".");
                ptochka = true;

            }
        });
        panel.add(zapitai);

    }

    public JPanel getPanel() {
        return panel;
    }
}
