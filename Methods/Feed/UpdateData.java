package com.stroyer.WhatToday.Methods.Feed;

import com.stroyer.WhatToday.Properties;

import java.io.FileNotFoundException;
import java.util.List;

public class UpdateData {
    public static void update(){
        try {
            Properties.feedData = ReadData.getData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
