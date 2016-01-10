/**
 * @name        Simple Java Calculator
 * @package     ph.calculator
 * @file        UI.java
 * @author      SORIA Pierre-Henry
 * @email       pierrehs@hotmail.com
 * @link        http://github.com/pH-7
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 * @create      2012-03-30
 *
 * @modifiedby  Achintha Gunasekara
 * @modweb      http://www.achinthagunasekara.com
 * @modemail    contact@achinthagunasekara.com
 */

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
