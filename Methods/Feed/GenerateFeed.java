package com.stroyer.WhatToday.Methods.Feed;

import com.stroyer.WhatToday.Methods.Feed.Data.FeedPost;
import com.stroyer.WhatToday.Properties;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GenerateFeed {
    public static JPanel begin(){
        JPanel p = new JPanel();

        List<JPanel> panels = new ArrayList<JPanel>();

        p.setLayout(new GridLayout(5, 1));

        GridLayout entry = new GridLayout(1, 2);
        JPanel p1 = new JPanel(entry);
        JPanel p2 = new JPanel(entry);
        JPanel p3 = new JPanel(entry);
        JPanel p4 = new JPanel(entry);
        JPanel p5 = new JPanel(entry);

            panels.add(p1);
            panels.add(p2);
            panels.add(p3);
            panels.add(p4);
            panels.add(p5);

        List<FeedPost> posts = new ArrayList<FeedPost>();
        posts = Properties.feedPost;

        for(int i = 0; i < panels.size(); i ++){
            JLabel username = new JLabel(posts.get(i).user.username);
            JLabel message = new JLabel(posts.get(i).msg);
            JPanel unamePanel = new JPanel();
            JPanel messagePanel = new JPanel();
            unamePanel.add(username);
            messagePanel.add(message);
            panels.get(i).add(unamePanel, "1");
            panels.get(i).add(messagePanel, "2");
            p.add(panels.get(i));
            panels.get(i).setVisible(true);
            p.setVisible(true);
        }




        return p;
    }
}
