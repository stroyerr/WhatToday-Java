package com.stroyer.WhatToday.Interfaces;

import javax.swing.*;
import java.awt.*;

public class HomePage {

    public static void open(){
        JFrame f = new JFrame("WhatToday");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel content = new JPanel();
        f.getContentPane().add(content);

        f.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        JPanel titleBar = new JPanel(new BoxLayout(content, BoxLayout.X_AXIS));
        JPanel navigationBar = new JPanel(new BoxLayout(content, BoxLayout.X_AXIS));

        JLabel title = new JLabel("Title");
        JLabel nav = new JLabel("nav");

        titleBar.setAlignmentX(Component.LEFT_ALIGNMENT);
        navigationBar.setAlignmentX(Component.RIGHT_ALIGNMENT);
        navigationBar.setAlignmentY(Component.BOTTOM_ALIGNMENT);

        f.setLayout(new FlowLayout());
        f.add(titleBar);
        f.add(navigationBar);
        f.pack();

        f.setVisible(true);
    }

}
