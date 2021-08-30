package com.stroyer.WhatToday.Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {
    public static void open(){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(3, 1));

        JPanel top = new JPanel(new GridLayout(1, 2));
        JPanel middle = new JPanel();
        JPanel bottom = new JPanel(new GridLayout(2,1));
        JPanel navigation = new JPanel(new GridLayout(1, 4));
        JPanel top1 = new JPanel();
        JPanel top2 = new JPanel();

        JLabel title = new JLabel("<html><h1>WhatToday</h1></html>");

            JButton home = new JButton("Home");
            JButton explore = new JButton("Explore");
            JButton activity = new JButton("Activity");
            JButton profile = new JButton("Profile");
            JLabel blank = new JLabel("");
            JButton newPost = new JButton("New Post");

            top1.add(title);
            top2.add(newPost);

                top.add(top1, "1");
                top.add(top2, "2");

                navigation.add(home, "1");
                navigation.add(explore, "2");
                navigation.add(activity, "3");
                navigation.add(profile, "4");

                bottom.add(blank, "1");
                bottom.add(navigation, "2");

        f.add(top, "1");
        f.add(middle, "2");
        f.add(bottom, "3");

        f.pack();
        f.setSize(500, 700);
        f.setVisible(true);

                home.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HomePage.open();
                    }
                });
    }
}
