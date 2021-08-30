package com.stroyer.WhatToday.Methods.Feed;

import com.stroyer.WhatToday.Alerts.Alert;
import com.stroyer.WhatToday.Properties;

import java.util.Arrays;
import java.util.List;

public class DecodeData {
    public static void decode(){
        List<String> raw = Properties.feedData;
        for(int i = 0; i < raw.size(); i++){
            String s = raw.get(i);
            char[] chars = s.toCharArray();
            for(int j = 0; j < chars.length; j++){
                char c = chars[j];
                int lim1 = 0;
                int lim2 = 0;
                boolean lim1Bool = false;
                boolean lim2Bool = false;
                if(c == '`' && !lim1Bool){
                    lim1 = j;
                    lim1Bool = true;
                }
                if(c == '`' && lim1Bool){
                    lim2 = j;
                    lim2Bool = true;
                }
                if(lim1Bool && lim2Bool){
                    int dif1 = lim2-lim1;
                    char[] c2;
                    for(int l = 0; l < dif1; l++){
                        //c2[l] = c[lim1 + l];
                    }
                }

            }
        }
    }
}
