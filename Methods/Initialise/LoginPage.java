package com.stroyer.WhatToday.Methods.Initialise;

import com.stroyer.WhatToday.Alerts.Alert;
import com.stroyer.WhatToday.Interfaces.Home;
import com.stroyer.WhatToday.Methods.Authenticate.Authenticate;
import com.stroyer.WhatToday.Methods.User.User;
import com.stroyer.WhatToday.Properties;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {

    public static void open(){
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(3, 1));
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel top = new JPanel();
        JPanel middle = new JPanel(new GridLayout(2, 2));
        JPanel bottom = new JPanel(new GridLayout(3, 1));

        JPanel middle1 = new JPanel();
        JPanel middle2 = new JPanel();
        JPanel middle3 = new JPanel();
        JPanel middle4 = new JPanel();

        JPanel bottom1 = new JPanel();
        JPanel bottom2 = new JPanel();
        JPanel bottom3 = new JPanel();


        JLabel title = new JLabel("<html><h1>WhatToday</h1></html>");
        JLabel userLabel = new JLabel("Username");
        JTextField userInput = new JTextField("",8);
        JLabel pwdLabel = new JLabel("Password");
        JPasswordField pwdInput = new JPasswordField("", 8);
        JButton submit = new JButton("Login");
        JButton register = new JButton("Don't have an account yet?");

        JLabel loginAlerts = new JLabel("<html><p style='color: red'>Enter a username and password</p></html>");

        top.add(title);

        middle1.add(userLabel);
        middle2.add(userInput);
        middle3.add(pwdLabel);
        middle4.add(pwdInput);

        middle.add(middle1, "1");
        middle.add(middle2, "2");
        middle.add(middle3, "3");
        middle.add(middle4, "4");

        bottom1.add(submit);
        bottom2.add(loginAlerts);
        bottom3.add(register);

        bottom.add(bottom1, "1");
        bottom.add(bottom2, "2");
        bottom.add(bottom3, "3");

        bottom2.setVisible(false);

        f.add(top, "1");
        f.add(middle, "2");
        f.add(bottom, "3");

        f.pack();
        f.setVisible(true);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(pwdInput.getText().isEmpty() || String.valueOf(userInput.getText()).isEmpty()){
                    loginAlerts.setText("<html><p style='color: red'>Enter a username and password</p></html>");
                    bottom2.setVisible(true);
                }else{
                    String pwdInputConverted = String.valueOf(pwdInput.getPassword());
                    boolean authenticated = Authenticate.initiate(userInput.getText(), pwdInputConverted);
                    if(authenticated){
                        User user = new User(userInput.getText());
                        Properties.user = user;
                        loginAlerts.setText("<html><p style = 'color: green;'>Welcome back, "+user.username+"!");
                        loginAlerts.setVisible(true);
                        bottom2.setVisible(true);
                        try {
                            Thread.sleep(800);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                        Home.open();
                        f.dispose();
                    }else{
                        loginAlerts.setText("<html><p style='color: red'>Invalid credentials.</p></html>");
                        bottom2.setVisible(true);
                    }
                }

            }
        });
    }

}
