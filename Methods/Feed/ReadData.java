package com.stroyer.WhatToday.Methods.Feed;

import com.stroyer.WhatToday.Alerts.Alert;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadData {

    private static List<String> loadedData = new ArrayList<String>();

    public static List<String> getData() throws FileNotFoundException {
        BufferedReader inputReader = new BufferedReader(new FileReader("FeedData.txt"));
        String line = null;
        String data = "";
        int j = loadedData.size();
        while (true) {
            try {
                if (!((line = inputReader.readLine() ) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            data = line;
            loadedData.add(data);
            j++;
        }
        return loadedData;
    }

    public static String getRawString(){
        BufferedReader inputReader = null;
        try {
            inputReader = new BufferedReader(new FileReader("FeedData.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        String[] loadedData = {""};
        String data = "";
        while (true) {
            try {
                if (!((line = inputReader.readLine() ) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }

            data = data + line;
        }
        return data;

    }
}
