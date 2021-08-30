package com.stroyer.WhatToday.Methods.Authenticate;

import com.stroyer.WhatToday.Alerts.Alert;

public class Authenticate {
    public static boolean initiate(String user, String pwd){
        String[] credentials = {
                user, pwd
        };

        Authenticator authenticate = new Authenticator(credentials);

        boolean success = authenticate.authenticated;
        return success;

    }
}
