package com.stroyer.WhatToday.Methods.Feed;

import com.stroyer.WhatToday.Alerts.Alert;
import com.stroyer.WhatToday.Methods.User.User;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FeedData {

    public static int id;
    public static User user;
    public static String msg;

    public FeedData(int id, User user, String msg){
        this.id = 1;
        this.user = user;
        this.msg = msg;
        try {
            write(id, user, msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write (int id, User user, String msg) throws IOException{
        BufferedWriter outputWriter = null;

        outputWriter = new BufferedWriter(new FileWriter("FeedData.txt"));
            // Maybe:
            outputWriter.write(ReadData.getRawString() + "˘" + "`"+id+"`"+ "ç"+user.username +"ç"+"Ø"+msg+"Ø" + "˘");
            // Or:
            outputWriter.newLine();
        outputWriter.flush();
        outputWriter.close();
        UpdateData.update();
    }
}
