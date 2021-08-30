package com.stroyer.WhatToday.Methods.Authenticate;

import com.stroyer.WhatToday.Alerts.Alert;
import com.stroyer.WhatToday.Properties;

public class Authenticator {

    public static boolean authenticated = false;

    public Authenticator(String[] credentials){
        String[][] list = Properties.credentials;
        for(int i = 0; i < list.length; i++){
            String[] current = list[i];

            if(credentials[0].equals(current[0]) && credentials[1].equals(current[1])){
                authenticated = true;
                return;
            }else{
                authenticated = false;
            }
        }
    }
}
