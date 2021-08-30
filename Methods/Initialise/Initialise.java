package com.stroyer.WhatToday.Methods.Initialise;

import com.stroyer.WhatToday.Alerts.Alert;
import com.stroyer.WhatToday.Methods.Feed.DecodeData;
import com.stroyer.WhatToday.Methods.Feed.FeedData;
import com.stroyer.WhatToday.Methods.Feed.ReadData;
import com.stroyer.WhatToday.Methods.Feed.UpdateData;
import com.stroyer.WhatToday.Methods.User.User;
import com.stroyer.WhatToday.Properties;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

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

        List<String> feedData = null;
        try {
            feedData = ReadData.getData();
            Alert.display("Worked");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Alert.display("Failed");
        }

        Properties.feedData = feedData;
        for(int i = 0; i < Properties.feedData.size(); i++){
            Alert.display(Properties.feedData.get(i));
        }
        UpdateData.update();
        DecodeData.decode();

    }

}
