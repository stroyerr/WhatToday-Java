package com.stroyer.WhatToday.Methods.Feed;

import com.stroyer.WhatToday.Alerts.Alert;
import com.stroyer.WhatToday.Properties;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecodeData {

    public static String username;
    public static String msg;

    public static int ID;

    public static void decode(){
        List<String> raw = Properties.feedData;
        Alert.display("raw size "+raw.size());

        for(int i = 0; i < raw.size(); i++) {
            String current = raw.get(i);
            Alert.display("Raw - " + current);
            boolean found1 = false;
            boolean found2 = false;
            int f1 = 0;
            int f2 = 0;
            int[] range = new int[2];
            char[] chars = current.toCharArray();

            // Find username


            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == 'ç' && !found1) {
                    f1 = j;
                    found1 = true;
                } else if (chars[j] == 'ç' && found1 && !found2) {
                    f2 = j;
                    found2 = true;
                }
                if (found1 && found2) {
                    range[0] = f1 + 1;
                    range[1] = f2;

                    username = current.substring(range[0], range[1]);

                    Alert.display("Found username: " + username);

                    found1 = false;
                    found2 = false;
                }
            }

            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == 'Ø' && !found1) {
                    f1 = j;
                    found1 = true;
                } else if (chars[j] == 'Ø' && found1 && !found2) {
                    f2 = j;
                    found2 = true;
                }
                if (found1 && found2) {
                    range[0] = f1 + 1;
                    range[1] = f2;

                    msg = current.substring(range[0], range[1]);

                    Alert.display("Found msg: " + msg);

                    found1 = false;
                    found2 = false;
                }
            }


        }
    }
}
