package com.stroyer.WhatToday.Methods.Feed;

import javax.swing.*;
import java.awt.*;

public class GenerateFeed {
    public static JPanel begin(){
        JPanel p = new JPanel();

        p.setLayout(new GridLayout(5, 1));

        GridLayout entry = new GridLayout(1, 2);
        JPanel p1 = new JPanel(entry);
        JPanel p2 = new JPanel(entry);
        JPanel p3 = new JPanel(entry);
        JPanel p4 = new JPanel(entry);
        JPanel p5 = new JPanel(entry);




        return p;
    }
}
