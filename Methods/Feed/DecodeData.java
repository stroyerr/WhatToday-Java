package com.stroyer.WhatToday.Methods.Feed;

import com.stroyer.WhatToday.Alerts.Alert;
import com.stroyer.WhatToday.Properties;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecodeData {

    public static int ID;

    public static void decode(){
        List<String> raw = Properties.feedData;
        for(int i = 0; i < raw.size(); i++){
            String current = raw.get(i);
            Integer[] startEnd = new Integer[2];
            char[] chars = (current.toCharArray());
            boolean startFound = false;
            for(int j = 0; j < chars.length; j++){
                if(chars[j] == '`' && !startFound){
                    Alert.display("found start at " + j);
                    startEnd[0] = j;
                    startFound = true;
                }else{
                    if(chars[j] == '`' && startFound){
                        Alert.display("found end at " + j);
                        startEnd[1] = j;
                    }
                }
                Alert.display(" Made it");
                Alert.display("" + startEnd[0] + " ");
                String idString = current.substring(startEnd[0], startEnd[1]);
                Alert.display(idString);
            }
        }
    }
}
