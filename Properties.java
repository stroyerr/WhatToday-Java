package com.stroyer.WhatToday;

import com.stroyer.WhatToday.Methods.User.User;

import java.util.ArrayList;
import java.util.List;

public class Properties {

    public static boolean isLoggedIn=false;
    public static User user;
    public static String[][] credentials = {
            {
              "angus", "admin"
            },
            {
                "james", "james"
            },
            {
                "ayla", "ayslay"
            },
            {
                "emma", "nutemma"
            }
    };

    public static List<String> feedData = new ArrayList<String>();

}
