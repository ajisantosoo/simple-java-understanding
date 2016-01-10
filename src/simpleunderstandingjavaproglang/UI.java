package simpleunderstandingjavaproglang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI implements ActionListener {
    private final JFrame frame;
    private final JPanel panel;
    private final JTextArea username;
    private final JTextArea password;
    private final JButton login, sign_up;

    public UI() {
        frame = new JFrame("Calculator PH");
        frame.setResizable(false);
        panel = new JPanel(new FlowLayout());

        username = new JTextArea(1, 20);
        password = new JTextArea(1, 20);
        login = new JButton("Login");
        sign_up = new JButton("Sign Up");
    }

    public void init() {
        frame.setVisible(true);
        frame.setSize(350, 280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.add(login);
        panel.add(password);

        panel.add(login);
        panel.add(sign_up);

        login.addActionListener(this);
        sign_up.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final Object source = e.getSource();

    }
}
