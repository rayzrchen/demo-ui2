package com.example.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel rootPanel;
    private JTextField nameTextField;
    private JTextField eMailTextField;
    private JLabel nameLabel;
    private JRadioButton subscribeRadioButton;
    private JRadioButton unsubcribeRadioButton;
    private JButton OKButton;
    private JButton cancelButton;

    public MainForm() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JFrame showForm() {
        JFrame frame = new JFrame("com.example.ui.main");
        frame.setContentPane(new MainForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(200, 100));
        frame.pack();
        frame.setVisible(true);
        return frame;
    }
}

