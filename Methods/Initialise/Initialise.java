package com.stroyer.WhatToday.Methods.Initialise;

import com.stroyer.WhatToday.Alerts.Alert;
import com.stroyer.WhatToday.Methods.Feed.FeedData;
import com.stroyer.WhatToday.Methods.Feed.ReadData;
import com.stroyer.WhatToday.Methods.User.User;
import com.stroyer.WhatToday.Properties;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Initialise {

    public static void start(){

        LoginPage.open();
//        try {
//            FeedData.write(1, new User("test1"), "test1");
//            FeedData.write(2, new User("test2"), "test2");
//            FeedData.write(2, new User("test3"), "test3");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Alert.display(ReadData.getRawString());

        String[] feedData = null;
        try {
            feedData = ReadData.getData();
            Alert.display("Worked");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Alert.display("Failed");
        }

        for(int i = 0; i < feedData.length; i++){
            Alert.display(feedData[i]);
        }

    }

}
