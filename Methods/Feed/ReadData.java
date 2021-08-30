package com.stroyer.WhatToday.Methods.Feed;

import com.stroyer.WhatToday.Alerts.Alert;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
    public static String[] getData() throws FileNotFoundException {
        BufferedReader inputReader = new BufferedReader(new FileReader("FeedData.txt"));
        String line = null;
        String[] loadedData = {""};
        while (true) {
            try {
                if (!((line = inputReader.readLine() ) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            int j = loadedData.length;
            Alert.display(" " + j);
            loadedData[j-1] = loadedData + line;
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
